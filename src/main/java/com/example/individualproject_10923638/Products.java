package com.example.individualproject_10923638;

public class Products {
    //When a product class is created, a category class will be created as well, so they'll have the same IDs
    private static int product_id;
    private String product_name;
    private int quantity;
    private int unitPrice;
    private int count = 1;

    public Products(String product_name, int quantity, int unitPrice) {
        this.product_name = product_name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        product_id = count++;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
