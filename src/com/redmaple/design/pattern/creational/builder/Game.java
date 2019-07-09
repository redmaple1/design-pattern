package com.redmaple.design.pattern.creational.builder;

public class Game {
    private String name;
    private String introduce;
    private String team;
    private String video;
    private String community;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
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
}
