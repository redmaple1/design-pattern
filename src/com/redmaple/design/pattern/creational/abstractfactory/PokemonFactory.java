package com.redmaple.design.pattern.creational.abstractfactory;

public class PokemonFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new PokemonGame();
    }

    @Override
    public Community getCommunity() {
        return new PokemonCommunity();
    }
}
