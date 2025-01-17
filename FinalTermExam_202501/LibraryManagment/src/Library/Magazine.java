package Library;

public class Magazine extends Publication {
    private int issueNumber;
    private boolean printedMonthly;

    public Magazine() {
    }

    public Magazine(String title, String publisher, int publicationYear, int issueNumber, boolean printedMonthly) {
        super(title, publisher, publicationYear);
        this.issueNumber = issueNumber;
        this.printedMonthly = printedMonthly;
    }

    @Override
    public void printDetails() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Printed Monthly: " + (printedMonthly ? "Yes" : "No"));
    }

    @Override
    public double getPublicationFee() {
        return printedMonthly ? 5.0 : 3.0; // Example fee calculation
    }
}