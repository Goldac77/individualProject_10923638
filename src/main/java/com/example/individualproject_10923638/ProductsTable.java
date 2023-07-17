package com.example.individualproject_10923638;

public class ProductsTable {
    private int productID;
    private String productName;
    private int categoryID;
    private int quantity;
    private int unitPrice;

    public ProductsTable(int productID, String productName, int categoryID, int quantity, int unitPrice) {
        this.productID = productID;
        this.productName = productName;
        this.categoryID = categoryID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getProductID() {
        return this.productID;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getCategoryID() {
        return this.categoryID;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getUnitPrice() {
        return this.unitPrice;
    }
}
