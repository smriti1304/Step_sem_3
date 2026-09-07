class Product {
    String productId;
    String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

public class prd {
    public static void main(String[] args) {

        Product p = new Product("P-1042", "Wireless Mouse");

        System.out.println(p.productId + " - " + p.productName);
    }
}