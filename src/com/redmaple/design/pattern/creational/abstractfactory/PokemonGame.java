package com.redmaple.design.pattern.creational.abstractfactory;

public class PokemonGame extends Game {
    @Override
    public void produce() {
        System.out.println("Pokemon game produced!");
    }
}
