package com.example.game;

public class GameManager {
    private static GameManager instance;
    private int currentLevel;
    private String difficulty;

    private GameManager() {
        currentLevel = 1;
        difficulty = "Easy";
    }

    public static synchronized GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int level) {
        this.currentLevel = level;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void startGame() {
        System.out.println("Starting game at level " + currentLevel + " with difficulty " + difficulty);
    }
}