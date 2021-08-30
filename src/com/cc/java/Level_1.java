package com.cc.java;

public class Level_1 extends Level_2{

    private String levelname = "Level 1";
    private int points = 100;

    public String play() {
        if (LevelManager.isplayerinlevel_1()) {
            return "Yahoo, " + levelname + " here, and i have " + points + " Points!";
            } else {
            return super.play();
            }
    }
    
    
}
