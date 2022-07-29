package com.github.curriculeon.jfoot;

import com.github.git_leon.jfoot.resources.JFootTextImageBuilder;
import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Greenfoot;

import java.util.List;

public class Bin extends Actor {
    private final int diceFaceValue;
    private int numberOfOccurrences;

    public Bin(int diceFaceValue) {
        this.numberOfOccurrences = 0;
        this.diceFaceValue = diceFaceValue;
        setImage(new JFootTextImageBuilder()
                .setBackground(Color.WHITE)
                .setForeground(Color.BLACK)
                .setOutline(Color.BLACK)
                .setSize(15)
                .setString(String.format("Face: %s", diceFaceValue))
                .build());
    }

    public void increaseCount() {
        numberOfOccurrences++;
    }

    public void refreshCountDisplay() {
        List<Bin> staleBinObjects = getWorld().getObjectsAt(getX() + 1, getY(), Bin.class);
        for(Bin bin : staleBinObjects) {
            getWorld().removeObject(bin);
        }
        getWorld().addObject(new Bin(numberOfOccurrences), getX() + 1, getY());
    }

    @Override
    public void act() {
        refreshCountDisplay();
    }
}
