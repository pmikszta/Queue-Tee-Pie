package org.example;
// simply kitty class 
public class PygmyMarmoset implements Cutie {

    @Override
    public String description() {
        return "It is a very small Monkey.";
    }

    @Override
    public Integer cutenessRating() {
        return 10; // Out of 10
    }
}
