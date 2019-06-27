package com.redmaple.design.pattern.creational.factorymethod;

public class MarioGameFactory extends GameFactory {
    @Override
    public Game getGame() {
        return new MarioGame();
    }
}
