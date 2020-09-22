package com.company;
import java.time.*;
public class Couple {
    private Person bride;
    private Person groom;
    public Couple(Person br, Person gr) {
        this.bride = br;
        this.groom = gr;
    }

    public Person getBride() {
        return bride;
    }
    public Person getGroom() {
        return groom;
    }
}
