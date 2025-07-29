package com.javacore;
import java.util.*;
class Product {
    private int productId;
    private String productName;
    private String productCategory;
    private double productPrice;
    private double productDiscount;
    private int productQuantity;

    public Product(int productId, String productName, String productCategory, double productPrice,
                   double productDiscount, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
        this.productQuantity = productQuantity;
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    

public String toString() {
       return "ProductId: " + productId + ", Name: " + productName + ", Price: " + productPrice + ", Category: " + productCategory;
  }

    static class ProductIdComparator implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            return Integer.compare(p1.getProductId(), p2.getProductId());
        }
    }
    
    static class ProductPriceComparator implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getProductPrice(), p2.getProductPrice());
        }
    }
}

public class Prog04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> p = new ArrayList<>();
        p.add(new Product(101, "iphone10", "Mobile", 20000.0, 0.2, 2));
        p.add(new Product(102, "Dell", "Laptop", 20000.0, 0.3, 4));
        p.add(new Product(103, "iphone13", "Mobile", 10000.0, 0.5, 1));
        p.add(new Product(104, "Lenovo", "Laptop", 70000.0, 0.8, 3));
        p.add(new Product(105, "iphone12", "Mobile", 50000.0, 0.5, 6));

        System.out.println("1-sort by id");
        System.out.println("2-list mobiles with price more than 40000");
        System.out.println("3-Exit");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                Collections.sort(p, new Product.ProductIdComparator());
                System.out.println("Sorted by Product ID:");
                for (Product pro : p) {
                    System.out.println(pro);
                }
                break;
            case 2:
                System.out.println("Mobiles with price greater than 40000:");
                for (Product pro : p) {
                    if (pro.getProductPrice() > 40000) {
                        System.out.println(pro);
                    }
                }
                break;
            case 3:
            	System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
