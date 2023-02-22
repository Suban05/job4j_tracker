package ru.job4j.early;

public class PasswordValidator {
    public static void raise(String message) {
        throw new IllegalArgumentException(message);
    }

    public static String validate(String password) {
        if (password == null) {
            raise("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            raise("Password should be length [8, 32]");
        }
        if (!isUpperCaseAnySymbol(password)) {
            raise("Password should contain at least one uppercase letter");
        }
        if (!isLowerCaseAnySymbol(password)) {
            raise("Password should contain at least one lowercase letter");
        }
        if (!isDigitCaseAnySymbol(password)) {
            raise("Password should contain at least one figure");
        }
        if (!hasAnySpecialSymbol(password)) {
            raise("Password should contain at least one special symbol");
        }
        if (notContainsSpecialString(password)) {
            raise("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    public static boolean notContainsSpecialString(String str) {
        return str.toLowerCase().contains("qwerty")
                || str.contains("12345")
                || str.toLowerCase().contains("password")
                || str.toLowerCase().contains("admin")
                || str.toLowerCase().contains("user");
    }
    public static boolean isUpperCaseAnySymbol(String str) {
        return new Validator(new UpperCaseValidator()).isValid(str);
    }

    public static boolean isLowerCaseAnySymbol(String str) {
        return new Validator(new LowerCaseValidator()).isValid(str);
    }

    public static boolean isDigitCaseAnySymbol(String str) {
        return new Validator(new DigitValidator()).isValid(str);
    }

    public static boolean hasAnySpecialSymbol(String str) {
        char[] symbols = str.toCharArray();
        for (int i = 1; i < symbols.length; i++) {
            int code = Character.codePointAt(symbols, i);
            if (isSpecialSymbol(code)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 95 || code == 36;
    }
}
