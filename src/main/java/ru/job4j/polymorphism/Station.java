package ru.job4j.polymorphism;

public class Station {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plain = new Plain();
        Vehicle train = new Train();
        Vehicle[] vehicles = {bus, plain, train};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
