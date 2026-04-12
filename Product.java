class Product {
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // 2. Getter for Price: Securely access the value
    public double getPrice() {
        return price;
    }

    // 3. Setter for Price: Protect modify sensitive values with validation
    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            System.out.println("Price updated successfully!");
        } else {
            System.out.println("Error: Invalid price. Value must be positive.");
        }
    }

    // Getter and Setter for Product Name
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

// Testing the code
class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000.0);

        // Direct access error: p1.price = -100; (This will fail if uncommented)
        
        // Securely updating price using Setter
        p1.setPrice(55000.0); 
        
        // Securely accessing price using Getter
        System.out.println("Product: " + p1.getProductName());
        System.out.println("Current Price: " + p1.getPrice());
    }
}

