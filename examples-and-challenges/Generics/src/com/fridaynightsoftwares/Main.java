package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        adelaideCrows.addPlayer(joe);
        chicagoCubs.addPlayer(pat);
        System.out.println(adelaideCrows.numPlayers());
    }
}
