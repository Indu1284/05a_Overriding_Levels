
package com.cc.java;
public class Level_0 extends Level_1{

    private String levelname = "Level 0";
    private int points = 10;

    public String play() {
        if (LevelManager.isplayerinlevel_0()) {
        return "Yahoo, " + levelname + " here, and i have " + points + " Points!";
        } else {
        return super.play();
        }
    }
    
}
