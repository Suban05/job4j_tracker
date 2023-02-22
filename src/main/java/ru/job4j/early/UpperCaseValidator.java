package ru.job4j.early;

public class UpperCaseValidator implements FormatValidator {
    public boolean check(char symbol) {
        return Character.isUpperCase(symbol);
    }
}
