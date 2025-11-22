package org.example;
// simply kitty class 
public class Puppy implements Cutie {

    @Override
    public String description() {
        return "It is a baby dog.";
    }

    @Override
    public Integer cutenessRating() {
        return 8; // Out of 10
    }
}
