package oops.practice;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public void display() {
        double total = qty * unitPrice;
        System.out.println("ID: " + id);
        System.out.println("Description: " + desc);
        System.out.println("Quantity: " + qty);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + total);
    }

    public static void main(String args[]) {
        InvoiceItem item = new InvoiceItem("A001", "Laptop", 1, 1000.0);
        item.display();
    }
}
