package com.redmaple.design.pattern.creational.abstractfactory;

public class MarioFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new MarioGame();
    }

    @Override
    public Community getCommunity() {
        return new MarioCommunity();
    }
}
