package ru.job4j.ex;

import ru.job4j.tracker.User;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
