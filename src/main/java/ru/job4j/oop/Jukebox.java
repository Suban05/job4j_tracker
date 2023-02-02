package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String music;
        if (position == 1) {
            music = "Пусть бегут неуклюже";
        } else if (position == 2) {
            music = "Спокойной ночи";
        } else {
            music = "Песня не найдена";
        }
        System.out.println(music);
    }

    public static void main(String[] args) {
        var jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
