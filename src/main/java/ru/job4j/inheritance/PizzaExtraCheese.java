package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    @Override
    public String name() {
        return String.format("%s + %s", super.name(), "extra cheese");
    }
}
