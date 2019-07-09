package com.redmaple.design.pattern.creational.builder;

public class GameManager {
    private GameBuilder gameBuilder;

    public void setGameBuilder(GameBuilder gameBuilder) {
        this.gameBuilder = gameBuilder;
    }

    public Game makeGame(String name, String introduce, String team, String video, String community) {
        gameBuilder.buildName(name);
        gameBuilder.buildIntroduce(introduce);
        gameBuilder.buildTeam(team);
        gameBuilder.buildVideo(video);
        gameBuilder.buildCommunity(community);
        return gameBuilder.makeGame();
    }

}
