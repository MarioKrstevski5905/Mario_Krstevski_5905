package Library;

public class Book extends Publication {
    private String author;
    private String ISBN;
    private int pageCount;

    public Book() {
    }

    public Book(String title, String publisher, int publicationYear, String author, String ISBN, int pageCount) {
        super(title, publisher, publicationYear);
        this.author = author;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
    }

    @Override
    public void printDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Page Count: " + pageCount);
    }

    @Override
    public double getPublicationFee() {
        return pageCount * 0.1; // Example fee calculation
    }
}