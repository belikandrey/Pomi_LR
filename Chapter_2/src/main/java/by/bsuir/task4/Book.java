package by.bsuir.task4;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private int year;
    private int countPages;

    public Book() {
    }

    public Book(String author, String title, int year, int countPages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.countPages = countPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public void setAuthor(Scanner scanner) {
        this.author = scanner.nextLine();
    }

    public void setTitle(Scanner scanner) {
        this.title = scanner.nextLine();
    }

    public void setYear(Scanner scanner) {
        this.year = scanner.nextInt();
    }
    
    public void setCountPages(Scanner scanner) {
        this.countPages = scanner.nextInt();
    }

    public void printInfo(List<Book> books, String title) {
        Optional<Book> bookOpt = books.stream().filter((p) -> p.title.equalsIgnoreCase(title)).findAny();
        bookOpt.ifPresent(System.out::println);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", countPages=" + countPages +
                '}';
    }
}
