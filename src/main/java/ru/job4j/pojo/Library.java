package ru.job4j.pojo;

public class Library {
    private static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
    }

    private static void swingBooks(Book[] books, int first, int second) {
        var tmp = books[second];
        books[second] = books[first];
        books[first] = tmp;
    }

    public static void main(String[] args) {
        var puzzleLife = new Book("Пазл жизни", 240);
        var traveler = new Book("Путешественник", 928);
        var steelHeart = new Book("Стальное сердце", 352);
        var cleanCode = new Book("Clean code", 659);
        Book[] books = {puzzleLife, traveler, steelHeart, cleanCode};
        printBooks(books);
        swingBooks(books, 0, 3);
        printBooks(books);
        for (int i = 0; i < books.length; i++) {
            var book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
