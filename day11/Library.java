package day11;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private static final String FILE_NAME = "issuedBooks.dat";

    public void issueBook(Book book, LocalDate issueDate) {
        book.setIssueDate(issueDate);
        book.setReturnDate(null); // Set return date to null when issued
        saveBookToFile(book);
    }

    public double calculateFine(Book book) {
        if (book.getIssueDate() == null) {
            return 0; 
        }
        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(book.getIssueDate(), today);
        if (daysBetween > 7) {
            return (daysBetween - 7) * 50; // 50 rs fine per day after 7 days
        }
        return 0;
    }

    private void saveBookToFile(Book book) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME, true))) {
            oos.writeObject(book);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> readBooksFromFile() {
        List<Book> books = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                Book book = (Book) ois.readObject();
                books.add(book);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

    public void generateReport() {
        List<Book> books = readBooksFromFile();
        try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt"))) {
            for (Book book : books) {
                double fine = calculateFine(book);
                writer.println(book);
                writer.println("Fine: " + fine);
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
