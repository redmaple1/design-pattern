package com.redmaple.design.pattern.creational.factorymethod;

public class PokemonGameFactory extends GameFactory {
    @Override
    public Game getGame() {
        return new PokemonGame();
    }
}
