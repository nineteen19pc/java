package day11;
import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    private String title;
    private double price;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        this.issueDate = null;
        this.returnDate = null;
    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public double getPrice() {
        return price;
    }

//    public void setPrice(double price) {
//        this.price = price;
//    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return LocalDate.now();
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Price: " + price + ", Issue Date: " + issueDate + ", Return Date: " + returnDate;
    }
}
