package com.github.curriculeon.jfoot;

import com.github.git_leon.jfoot.system.JFootApplication;
import greenfoot.Greenfoot;
import greenfoot.core.WorldHandler;

/**
 * @author leonhunter
 * @created 04/03/2020 - 3:59 PM
 */
public class MainApplication {
    public static void main(String[] args) {
        new JFootApplication().run();
        BinAndDiceWorld world = new BinAndDiceWorld();
        WorldHandler.getInstance().getWorld();
        Greenfoot.setWorld(world);
        Greenfoot.setSpeed(100);
        world.populate();
    }
}
