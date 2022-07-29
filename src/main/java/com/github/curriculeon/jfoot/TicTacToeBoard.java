package com.github.curriculeon.jfoot;

import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Arrays;
import java.util.List;

/**
 * A world where wombats live.
 *
 * @author Michael Kölling
 * @version 2.0
 */
public class TicTacToeBoard extends World {
    /**
     * Create a new world with 3x3 cells and
     * with a cell size of 60x60 pixels.
     */
    public TicTacToeBoard() {
        super(5, 5, 60);
        setBackground("cell.jpg");
        setPaintOrder(Circle.class, Cross.class, Bin.class);
        populate();
    }

    public void populate() {
        for (int yPosition = 0; yPosition <= getHeight(); yPosition++) {
            int faceValue = yPosition + 1;
            addObject(new Bin(yPosition), 0, yPosition);
            addObject(new Bin(yPosition+7), 3, yPosition);
        }
    }


    @Override
    public void act() {
        List<PlayerPiece> pieces = getObjects(PlayerPiece.class);
        for(PlayerPiece piece : pieces) {
        }
    }
}