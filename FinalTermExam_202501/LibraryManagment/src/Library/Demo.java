package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Magazine> magazines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Library Management Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Display all publications");
            System.out.println("4. Find oldest publication");
            System.out.println("5. Find newest publication");
            System.out.println("6. Calculate average publication fee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter publisher: ");
                    String bookPublisher = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int bookYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter page count: ");
                    int pageCount = scanner.nextInt();
                    books.add(new Book(bookTitle, bookPublisher, bookYear, author, ISBN, pageCount));
                    break;

                case 2:
                    System.out.print("Enter title: ");
                    String magazineTitle = scanner.nextLine();
                    System.out.print("Enter publisher: ");
                    String magazinePublisher = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int magazineYear = scanner.nextInt();
                    System.out.print("Enter issue number: ");
                    int issueNumber = scanner.nextInt();
                    System.out.print("Is it printed monthly? (true/false): ");
                    boolean printedMonthly = scanner.nextBoolean();
                    magazines.add(new Magazine(magazineTitle, magazinePublisher, magazineYear, issueNumber, printedMonthly));
                    break;

                case 3:
                    System.out.println("Books:");
                    for (Book book : books) {
                        book.printDetails();
                        System.out.println();
                    }
                    System.out.println("Magazines:");
                    for (Magazine magazine : magazines) {
                        magazine.printDetails();
                        System.out.println();
                    }
                    break;

                case 4:
                    Publication oldest = null;
                    for (Book book : books) {
                        if (oldest == null || book.publicationYear < oldest.publicationYear) {
                            oldest = book;
                        }
                    }
                    for (Magazine magazine : magazines) {
                        if (oldest == null || magazine.publicationYear < oldest.publicationYear) {
                            oldest = magazine;
                        }
                    }
                    if (oldest != null) {
                        System.out.println("Oldest Publication:");
                        oldest.printDetails();
                    } else {
                        System.out.println("No publications found.");
                    }
                    break;

                case 5:
                    Publication newest = null;
                    for (Book book : books) {
                        if (newest == null || book.publicationYear > newest.publicationYear) {
                            newest = book;
                        }
                    }
                    for (Magazine magazine : magazines) {
                        if (newest == null || magazine.publicationYear > newest.publicationYear) {
                            newest = magazine;
                        }
                    }
                    if (newest != null) {
                        System.out.println("Newest Publication:");
                        newest.printDetails();
                    } else {
                        System.out.println("No publications found.");
                    }
                    break;

                case 6:
                    double totalFee = 0;
                    int totalCount = 0;
                    for (Book book : books) {
                        totalFee += book.getPublicationFee();
                        totalCount++;
                    }
                    for (Magazine magazine : magazines) {
                        totalFee += magazine.getPublicationFee();
                        totalCount++;
                    }
                    if (totalCount > 0) {
                        double averageFee = totalFee / totalCount;
                        System.out.println("Average Publication Fee: " + averageFee);
                    } else {
                        System.out.println("No publications found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}