package com.redmaple.design.pattern.creational.factorymethod;

public class ZeldaGameFactory extends GameFactory {
    @Override
    public Game getGame() {
        return new ZeldaGame();
    }
}
