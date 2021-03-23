package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int playedGames = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {

            // We don't have to do any casting here because we know for sure that T will be Player:
            System.out.println(player.getName() + " is already on the team.");
            return false;
        }
        members.add(player);

        // Same here:
        System.out.println(player.getName() + " picked for the team " + name);
        return false;
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        playedGames++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore); // Updates the opponent's score recursively:

        }
    }

    public int ranking() {
        return won * 2 + tied;
    }

    // Method specified in the Comparable<T> generic interface.
    // This method allows us to compare only the teams that are from the same sport. So, no baseball teams and football
    // teams can be compared, for example.
    // In main(), this: adelaideCrows.compareTo(chicagoCubs)) would throw an error, because one is of type
    // Team<FootballPlayer>, and the other, Team<BaseballPlayer>.
    @Override
    public int compareTo(Team<T> team) {
        if (ranking() > team.ranking()) {
            return -1;
        } else if (ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
