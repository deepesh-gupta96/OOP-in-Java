package com.company;

public class Team {
    private String name;
    private String sport;
    private String mascot;
    public final static String MOTTO = "Sportsmanship!";
    public Team(String name, String sport, String mascot) {
        this.name = name;
        this.sport = sport;
        this.mascot = mascot;
    }
    public String getName() {
        return name;
    }
    public String getSport() {
        return sport;
    }
    public String getMascot() {
        return mascot;
    }
}
