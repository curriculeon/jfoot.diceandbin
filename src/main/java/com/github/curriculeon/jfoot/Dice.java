package com.github.curriculeon.jfoot;

import com.github.git_leon.RandomUtils;

public class Dice {
    public Integer roll() {
        return RandomUtils.createInteger(1, 6);
    }
}
