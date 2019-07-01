package com.redmaple.design.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        GameFactory gameFactory = new MarioFactory();
        Game game = gameFactory.getGame();
        Community community = gameFactory.getCommunity();
        game.produce();
        community.produce();
    }
}
