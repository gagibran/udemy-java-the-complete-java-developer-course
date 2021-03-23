package com.fridaynightsoftwares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Sport>{
    private String name;
    private List<T> teams;

    public LeagueTable(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("The team " + team.getName() + " is already on the league.");
            return false;
        }
        System.out.println("Sport " + team.getName() + " added to the league.");
        teams.add(team);
        return true;
    }

    public void printTeams() {
        System.out.println("The teams ordered by rank are:");
        List<Double> points = new ArrayList<>();
        for (T team : teams) {
            points.add(team.getPoints());
        }
        Collections.sort(points);
        Collections.reverse(points);
        for (double point : points) {
            System.out.println(point);
        }
    }
}
