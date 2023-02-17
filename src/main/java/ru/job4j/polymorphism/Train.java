package ru.job4j.polymorphism;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("I'm riding the rails.");
    }
}
