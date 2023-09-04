import java.util.Scanner;

class Publisher {
    private String publisherName;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherName() {
        return publisherName;
    }
}

class Book extends Publisher {
    private String bookTitle;

    public Book(String publisherName, String bookTitle) {
        super(publisherName);
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}

class Literature extends Book {
    private String genre;

    public Literature(String publisherName, String bookTitle, String genre) {
        super(publisherName, bookTitle);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

class Fiction extends Book {
    private String author;

    public Fiction(String publisherName, String bookTitle, String author) {
        super(publisherName, bookTitle);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Literature literatureBook = new Literature("Publisher A", "Literature Book", "Novel");
        Fiction fictionBook = new Fiction("Publisher B", "Fiction Book", "Author X");

       
        System.out.println("Book Details:");
        System.out.println("Publisher: " + literatureBook.getPublisherName());
        System.out.println("Book Title: " + literatureBook.getBookTitle());
        System.out.println("Genre: " + literatureBook.getGenre());
        System.out.println();
        System.out.println("Publisher: " + fictionBook.getPublisherName());
        System.out.println("Book Title: " + fictionBook.getBookTitle());
        System.out.println("Author: " + fictionBook.getAuthor());

        scanner.close();
    }
}