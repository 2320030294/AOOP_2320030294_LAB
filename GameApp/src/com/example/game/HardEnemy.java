package com.example.game;

public class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Hard enemy attacks with a strong hit.");
    }
}