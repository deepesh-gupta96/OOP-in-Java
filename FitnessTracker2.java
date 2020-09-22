package com.company;

import java.time.*;
public class FitnessTracker2 {
    String activity;
    int minutes;
    LocalDate date;
    public FitnessTracker2() {
        this("running",0, LocalDate.of(2020,01,01));

    }
    public FitnessTracker2(String activityParam, int minutesParam, LocalDate dateParam) {
        activity = activityParam;
        minutes = minutesParam;
        date = dateParam;
    }

    public String getActivity() {
        return activity;

    }
    public int getMinutes() {
        return minutes;

    }
    public LocalDate getDate() {
        return date;

    }
}

/*import java.time.*;
public class FitnessTracker2 {
    String activity;
    int minutes;
    LocalDate date;
    public FitnessTracker2() {
    }
    public FitnessTracker2(String activityParam, int minutesParam, LocalDate dateParam) {
    }
    public String getActivity() {
    }
    public int getMinutes() {
    }
    public LocalDate getDate() {
    }
}

*/
