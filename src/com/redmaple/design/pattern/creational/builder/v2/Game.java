package com.redmaple.design.pattern.creational.builder.v2;

public class Game {
    private String name;
    private String introduce;
    private String team;
    private String video;
    private String community;

    public Game(GameBuilder gameBuilder) {
        this.name = gameBuilder.name;
        this.introduce = gameBuilder.introduce;
        this.team = gameBuilder.team;
        this.video = gameBuilder.video;
        this.community = gameBuilder.community;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", team='" + team + '\'' +
                ", video='" + video + '\'' +
                ", community='" + community + '\'' +
                '}';
    }

    public static class GameBuilder {
        private String name;
        private String introduce;
        private String team;
        private String video;
        private String community;

        public GameBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public GameBuilder buildIntroduce(String introduce) {
            this.introduce = introduce;
            return this;
        }

        public GameBuilder buildTeam(String team) {
            this.team = team;
            return this;
        }

        public GameBuilder buildVideo(String video) {
            this.video = video;
            return this;
        }

        public GameBuilder buildCommunity(String community) {
            this.community = community;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }

}
