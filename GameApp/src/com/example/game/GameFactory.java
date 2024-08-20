package com.example.game;

public interface GameFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}