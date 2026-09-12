class Book {
    String title;
    double price;
}

public class Bk {
    public static void main(String[] args) {

        Book b = new Book();

        b.title = "Clean Code";
        b.price = 650.0;

        System.out.println("Title: " + b.title + " | Price: Rs " + b.price);
    }
}