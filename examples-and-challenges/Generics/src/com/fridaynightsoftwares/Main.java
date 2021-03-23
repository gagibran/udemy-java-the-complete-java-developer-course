package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//            Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
//        adelaideCrows.addPlayer(joe);
//        chicagoCubs.addPlayer(pat);
//        System.out.println(adelaideCrows.numPlayers());
        MultipleTypes<Integer, String> multipleTypes = new MultipleTypes<>(1, "A string");
        MultipleTypes<Double, String> multipleTypesTwo = new MultipleTypes<>(2.3, "A string");
        multipleTypes.multiply(multipleTypesTwo);
    }
}
