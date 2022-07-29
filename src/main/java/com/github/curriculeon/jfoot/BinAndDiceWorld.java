package com.github.curriculeon.jfoot;

import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.List;

/**
 * A world where wombats live.
 *
 * @author Michael Kölling
 * @version 2.0
 */
public class BinAndDiceWorld extends World {
    /**
     * Create a new world with 3x3 cells and
     * with a cell size of 60x60 pixels.
     */
    public BinAndDiceWorld() {
        super(5, 5, 60);
        setBackground("cell.jpg");
        populate();
    }

    public void populate() {
        for (int yPosition = 0; yPosition <= getHeight(); yPosition++) {
            addObject(new Data(String.format("Face: %s", yPosition), yPosition), 0, yPosition);
            addObject(new Data(String.format("Face: %s", yPosition+7), yPosition+7), 3, yPosition);
        }
    }


    @Override
    public void act() {
    }
}