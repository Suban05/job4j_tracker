package ru.job4j.polymorphism;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("I'm moving on a high-speed highway");
    }
}
