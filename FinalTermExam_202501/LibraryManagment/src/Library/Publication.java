package Library;

public abstract class Publication {
    protected String title;
    protected String publisher;
    protected int publicationYear;

    public Publication() {
    }

    public Publication(String title, String publisher, int publicationYear) {
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public abstract void printDetails();
    public abstract double getPublicationFee();
}

