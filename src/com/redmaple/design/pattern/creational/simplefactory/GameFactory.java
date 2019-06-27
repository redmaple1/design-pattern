package com.redmaple.design.pattern.creational.simplefactory;

public class GameFactory {
    public Game getGame(String type){
        if ("mario".equalsIgnoreCase(type)){
            return new MarioGame();
        }else if ("zelda".equalsIgnoreCase(type)){
            return new ZeldaGame();
        }else {
            return null;
        }
    }
}
