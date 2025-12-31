package LW_05;

import java.util.ArrayList;

abstract class BorrowableItems {
    public abstract void displayInfo();
}

class Book extends BorrowableItems {

    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + available);
        System.out.println();
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }
}

class Library {

    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.setAvailable(false);
                    return;
                }
            }
        }
    }

    public void listAvailableItems() {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int availableCount = 0;

        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    availableCount++;
                }
            }
        }

        System.out.println("Total Items: " + borrowableItemsList.size());
        System.out.println("Available Items: " + availableCount);
        System.out.println();
    }
}

public class Q1 {

    public static void main(String[] args) {

        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        Library library = new Library();

        library.addLibraryItem(b1);
        library.addLibraryItem(b2);
        library.addLibraryItem(b3);

        library.displayLibraryInfo();
        library.listAvailableItems();

        library.checkoutItem("Island of a Thousand Mirrors");

        library.listAvailableItems();
    }
}
