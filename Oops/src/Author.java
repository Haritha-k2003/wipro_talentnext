import java.util.Scanner;

// Author class
class Author {
    private String name;
    private String email;
    private char gender;

    // Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // toString method
    public String toString() {
        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }
}

// Book class
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // toString method
    public String toString() {
        return "Book Name: " + name + "\n" +
               "Price: " + price + "\n" +
               "Quantity in Stock: " + qtyInStock + "\n" +
               author.toString();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Author details
        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Author Email: ");
        String authorEmail = sc.nextLine();

        System.out.print("Enter Author Gender (M/F): ");
        char authorGender = sc.next().charAt(0);
        sc.nextLine(); // Consume leftover newline

        Author author = new Author(authorName, authorEmail, authorGender);

        // Input Book details
        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity in Stock: ");
        int qty = sc.nextInt();

        Book book = new Book(bookName, author, price, qty);

        // Display book details
        System.out.println("\n--- Book Details ---");
        System.out.println(book);

        sc.close();
    }
}
