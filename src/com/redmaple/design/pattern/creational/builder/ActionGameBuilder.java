package com.redmaple.design.pattern.creational.builder;

public class ActionGameBuilder extends GameBuilder {
    Game game = new Game();

    @Override
    public void buildName(String name) {
        game.setName(name);
    }

    @Override
    public void buildIntroduce(String introduce) {
        game.setIntroduce(introduce);
    }

    @Override
    public void buildTeam(String team) {
        game.setTeam(team);
    }

    @Override
    public void buildVideo(String video) {
        game.setVideo(video);
    }

    @Override
    public void buildCommunity(String community) {
        game.setCommunity(community);
    }

    @Override
    public Game makeGame() {
        return game;
    }
}
