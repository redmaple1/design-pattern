package com.redmaple.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        GameBuilder gameBuilder = new ActionGameBuilder();

        GameManager manager = new GameManager();
        manager.setGameBuilder(gameBuilder);

        Game game = manager.makeGame("游戏名称",
                "这是一个很好玩的动作游戏",
                "制作团队",
                "游戏宣传视频",
                "游戏社区");
        System.out.println(game);
    }

}
