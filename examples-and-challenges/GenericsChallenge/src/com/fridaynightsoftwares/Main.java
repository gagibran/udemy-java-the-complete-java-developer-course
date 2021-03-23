// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

package com.fridaynightsoftwares;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Baseball losAngelesAngels = new Baseball("Los Angeles Angels", 10.32);
        Baseball chicagoCubs = new Baseball("Chicago Cubs", 13.23);
        Football bayern = new Football("Bayern", 54.32);
        Football dortmund = new Football("Dortmund", 22.33);
        LeagueTable<Baseball> mlb = new LeagueTable<>("Major League Baseball");
        LeagueTable<Football> championsLeague = new LeagueTable<>("Champions League");
        // mlb.addTeam(bayern); // Doesn't work.
        mlb.addTeam(losAngelesAngels);
        mlb.addTeam(chicagoCubs);
        // championsLeague.addTeam(chicagoCubs); // Doesn't work.
        championsLeague.addTeam(bayern);
        championsLeague.addTeam(dortmund);
        mlb.printTeams();
        System.out.println();
        championsLeague.printTeams();
    }
}
