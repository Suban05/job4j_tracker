package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class SystemUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item.getCreated().format(format));
    }
}
