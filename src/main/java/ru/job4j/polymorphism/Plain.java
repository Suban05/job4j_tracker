package ru.job4j.polymorphism;

public class Plain implements Vehicle {
    @Override
    public void move() {
        System.out.println("I'm flying through the air");
    }
}
