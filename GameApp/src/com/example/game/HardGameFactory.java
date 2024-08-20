package com.example.game;

public class HardGameFactory implements GameFactory {
    @Override
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}