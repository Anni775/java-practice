package oops;

class BookManagement {
    static int totalNoOfBooks;
    String author;
    String name;
    String isbn;
    Boolean isBorrowed = false ;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    BookManagement(String name, String author, String isbn) {
        this.author = author;
        this.name = name;
        this.isbn = isbn;
    }

    BookManagement(String isbn) {
        this(isbn, "unknown", "unknown");
    }

    static int getTotalNOOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Enjoy your book");
        } else {
            System.out.println("This book is already borrowed");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Hope you enjoyed, please leave a review");
        } else {
            System.out.println("Book is already in library ");
        }
    }
    public static void main(String[] args) {
        BookManagement math = new BookManagement("12");
        BookManagement science = new BookManagement("13");
        System.out.println(BookManagement.getTotalNOOfBooks());
        math.borrowBook();
        math.returnBook();
        math.borrowBook();
        math.borrowBook();
        science.returnBook();
        science.borrowBook();
        System.out.println(BookManagement.getTotalNOOfBooks());
    }

}





