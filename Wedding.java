package com.company;

import java.time.LocalDate;

public class Wedding {
    private Couple couple;
    private LocalDate weddingDate;
    private String location;
    public Wedding(Couple c, LocalDate date, String loc) {
        this.couple = c;
        this.location = loc;
        this.weddingDate = date;
    }
    public Couple getCouple() {
        return couple;
    }
    public LocalDate getWeddingDate() {
        return weddingDate;
    }
    public String getLocation() {
        return location;
    }
}
