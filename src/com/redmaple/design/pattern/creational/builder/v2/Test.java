package com.redmaple.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Game game = new Game.GameBuilder().buildName("游戏名称")
                .buildIntroduce("这是一个很好玩的游戏")
                .buildTeam("制作团队")
                .buildVideo("介绍视频")
                .buildCommunity("游戏社区")
                .build();
        System.out.println(game);
    }
}
