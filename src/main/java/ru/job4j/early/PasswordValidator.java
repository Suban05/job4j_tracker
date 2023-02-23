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
        checkSymbols(password);
        if (containsSpecialString(password)) {
            raise("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    public static boolean containsSpecialString(String str) {
        String[] exceptions = {"qwerty", "12345", "password", "admin", "user"};
        for (String exp : exceptions) {
            if (str.toLowerCase().contains(exp)) {
                return true;
            }
        }
        return false;
    }

    public static void checkSymbols(String str) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialSymbol = false;
        char[] symbols = str.toCharArray();
        for (int i = 1; i < symbols.length; i++) {
            char symbol = symbols[i];
            if (!hasUpperCase) {
                hasUpperCase = Character.isUpperCase(symbol);
            }
            if (!hasLowerCase) {
                hasLowerCase = Character.isLowerCase(symbol);
            }
            if (!hasDigit) {
                hasDigit = Character.isDigit(symbol);
            }
            int code = Character.codePointAt(symbols, i);
            if (!hasSpecialSymbol) {
                hasSpecialSymbol = isSpecialSymbol(code);
            }
        }
        if (!hasUpperCase) {
            raise("Password should contain at least one uppercase letter");
        }
        if (!hasLowerCase) {
            raise("Password should contain at least one lowercase letter");
        }
        if (!hasDigit) {
            raise("Password should contain at least one figure");
        }
        if (!hasSpecialSymbol) {
            raise("Password should contain at least one special symbol");
        }
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 95 || code == 36;
    }
}
