import java.util.ArrayList;

public class Q5 {

    abstract static class BorrowableItems {
        public abstract void displayInfo();
    }

    static class Book extends BorrowableItems {
        private String title;
        private String author;
        private String ISBN;
        private boolean available;

        public Book(String title, String author, String ISBN, boolean available) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.available = available;
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
            System.out.println("Available: " + (available ? "Yes" : "No"));
            System.out.println("-----------------------");
        }
    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Student extends Person {
        public Student(String name) {
            super(name);
        }
    }

    static class Library {
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
                    if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Checked out: " + title);
                        return;
                    }
                }
            }
            System.out.println("Book not found or already checked out: " + title);
        }

        public void listAvailableItems() {
            System.out.println("Available Library Items:");
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
                if (item instanceof Book && ((Book) item).isAvailable()) {
                    availableCount++;
                }
            }
            System.out.println("Total Items in Library: " + borrowableItemsList.size());
            System.out.println("Available Items: " + availableCount);
            System.out.println("=======================");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        Library library = new Library();
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        library.displayLibraryInfo();
        library.listAvailableItems();

        library.checkoutItem("Island of a Thousand Mirrors");

        library.listAvailableItems();
        library.displayLibraryInfo();
    }
}
