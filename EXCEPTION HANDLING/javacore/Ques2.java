package oops.test;
//import java.util.*;
abstract class Product {
    int productId;
    String productName;
    Double price;

    public Product(int productId, String productName, Double price) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    abstract public void displayInfo();
}

class ElectronicProduct extends Product {
    int warrantyPeriod;

    public ElectronicProduct(int productId, String productName, Double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Warranty Period: "+warrantyPeriod+"Months");
    }
}

class ClothingProduct extends Product {
    String size;
    String material;

    public ClothingProduct(int productId, String productName, Double price, String size, String material) {
        super(productId, productName, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

public class Ques2 {
    public static void main(String args[]) {
    	System.out.println("ELECTRONIC PRODUCT INFORMATION:");
        Product p1 = new ElectronicProduct(201, "Laptop", 1200.0, 12); 
        Product p2 = new ClothingProduct(301, "shirt", 25.0, "M", "cotton");
        p1.displayInfo();
   
        System.out.println("CLOTHING PRODUCT INFORMATION");
        p2.displayInfo(); 
    }
}
