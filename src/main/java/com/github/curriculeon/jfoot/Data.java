package com.github.curriculeon.jfoot;

import com.github.git_leon.jfoot.resources.JFootTextImageBuilder;
import greenfoot.Actor;
import greenfoot.Color;

import java.util.List;

public class Data extends Actor {
    private final int diceFaceValue;
    private int numberOfOccurrences;

    public Data(String text, int diceFaceValue) {
        this.numberOfOccurrences = 0;
        this.diceFaceValue = diceFaceValue;
        setImage(new JFootTextImageBuilder()
                .setBackground(Color.WHITE)
                .setForeground(Color.BLACK)
                .setOutline(Color.BLACK)
                .setSize(15)
                .setString(text)
                .build());
    }

    public void refreshCountDisplay() {
        List<Data> staleBinObjects = getWorld().getObjectsAt(getX() + 1, getY(), Data.class);
        for(Data bin : staleBinObjects) {
            getWorld().removeObject(bin);
        }
        Data counterData = new Data("Value: " + numberOfOccurrences, numberOfOccurrences);
        getWorld().addObject(counterData, getX() + 1, getY());
    }

    public void increaseCount() {
        numberOfOccurrences++;
    }

    @Override
    public void act() {
        refreshCountDisplay();
    }
}
