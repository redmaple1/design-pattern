package com.redmaple.design.pattern.creational.builder;

public abstract class GameBuilder {
    public abstract void buildName(String name);

    public abstract void buildIntroduce(String introduce);

    public abstract void buildTeam(String team);

    public abstract void buildVideo(String video);

    public abstract void buildCommunity(String community);

    public abstract Game makeGame();
}
