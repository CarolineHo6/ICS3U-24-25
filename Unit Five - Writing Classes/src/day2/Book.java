package day2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        yearPublished = 2000;
        price = 9.99;
    }

    public Book(String title) {
        this.title = title;
        author = "Unknown Author";
        yearPublished = 2000;
        price = 9.99;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + " Author: " + author+ " Year Published: " + yearPublished + " Price: " + price);
    }

    public void displayDetails(boolean showTitleAndAuthorOnly) {
        if (showTitleAndAuthorOnly) {
            System.out.println("Title: " + title + " Author: " + author);
        } else {
            displayDetails();
        }
    }

    public void displayDetails(String showTitleOnly) {
        if (showTitleOnly != null) {
            System.out.println("Title: " + showTitleOnly);
        } else {
            displayDetails();
        }
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setYearPublished(int newYearPublished) {
        yearPublished = newYearPublished;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }
}
