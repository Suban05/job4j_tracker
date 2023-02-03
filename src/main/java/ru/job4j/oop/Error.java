package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error2 = new Error(
                false,
                401,
                "the required parameter \"client\" is empty"
        );
        error2.printInfo();
        Error error3 = new Error(
                true,
                400,
                "no access"
        );
        error3.printInfo();
    }
}
