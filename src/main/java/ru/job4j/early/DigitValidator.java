package ru.job4j.early;

public class DigitValidator implements FormatValidator {
    public boolean check(char symbol) {
        return Character.isDigit(symbol);
    }
}
