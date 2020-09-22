package com.company;

public class TestGame {
    public static void main(String[] args)
    {
        Team team1 = new Team("Roosevelt High", "Girls Basketball", "Dolphins");
        Team team2 = new Team("Hoover High", "Girls Basketball", "Tigers");
        Game game1 = new Game(team1, team2, "7 PM");
        display(game1);
    }
    public static void display(Game g)
    {
        Team t1 = g.getTeam1();
        Team t2 = g.getTeam2();
        System.out.println("The game between " + t1.getName() + " " + t1.getSport() +
                " " + t1.getMascot());
        System.out.println("   and " + t2.getName() + " " + t2.getSport() +
                " " + t2.getMascot());
        System.out.println("   takes place at " + g.getTime());
    }
}
