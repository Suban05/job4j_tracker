package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void passengers(int count) {
        System.out.println("passengers: " + count);
    }

    @Override
    public int refuel(int fuel) {
        return 0;
    }
}
