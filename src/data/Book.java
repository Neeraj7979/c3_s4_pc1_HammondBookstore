package data;

public class Book {
    private long isbnNumber;
    private String title;
    private String description;
    private double price;
    private Author author;


    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void displayBookDetails(){
        System.out.println("ISBN Number : " + isbnNumber);
        System.out.println("Book Title : " + title);
        System.out.println("Book Description : " + description);
        System.out.println("Book Price : " + price);




    }
}
