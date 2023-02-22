package ru.job4j.early;

public class Validator {
    FormatValidator formatValidator;

    public Validator(FormatValidator formatValidator) {
        this.formatValidator = formatValidator;
    }

    public boolean isValid(String str) {
        for (char symbol : str.toCharArray()) {
            if (formatValidator.check(symbol)) {
                return true;
            }
        }
        return false;
    }
}