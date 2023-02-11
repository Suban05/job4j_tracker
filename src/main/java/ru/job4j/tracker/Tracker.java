package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        int internalSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                rsl[internalSize] = item;
                internalSize++;
            }
        }
        return Arrays.copyOf(rsl, internalSize);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int internalSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                rsl[internalSize] = item;
                internalSize++;
            }
        }
        return Arrays.copyOf(rsl, internalSize);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}