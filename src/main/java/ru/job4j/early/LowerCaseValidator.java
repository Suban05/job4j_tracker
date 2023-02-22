package ru.job4j.early;

public class LowerCaseValidator implements FormatValidator{
    public boolean check(char symbol) {
        return Character.isLowerCase(symbol);
    }
}
