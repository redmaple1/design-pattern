package com.redmaple.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        Game game = new MarioGame();
//        game.produce();
//
//        game = new ZeldaGame();
//        game.produce();

        //使用factory
        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.getGame("zelda");
        if (game == null){
            return;
        }
        game.produce();
    }
}
