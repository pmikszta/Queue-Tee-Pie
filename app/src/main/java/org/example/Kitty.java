package org.example;
// simply kitty class 
public class Kitty implements Cutie {

    @Override
    public String description() {
        return "It is a baby cat.";
    }

    @Override
    public Integer cutenessRating() {
        return 9; // Out of 10
    }
}
