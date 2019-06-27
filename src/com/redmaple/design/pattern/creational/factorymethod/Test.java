package com.redmaple.design.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        GameFactory gameFactory = new PokemonGameFactory();
        Game game = gameFactory.getGame();
        game.produce();
    }
}
