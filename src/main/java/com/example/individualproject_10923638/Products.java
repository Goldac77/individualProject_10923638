package com.example.individualproject_10923638;

public class Products {
    private static int count = 1;
    private int product_id;
    private String product_name;
    private int quantity;
    private int unitPrice;

    public Products(String product_name, int quantity, int unitPrice) {
        this.product_id = count++;
        this.product_name = product_name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}
