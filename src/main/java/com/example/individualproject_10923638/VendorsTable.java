package com.example.individualproject_10923638;

public class VendorsTable {
    private int vendorID;
    private String vendorName;
    private String contact;

    public VendorsTable(int vendorID, String vendorName, String contact) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.contact = contact;
    }

    public int getVendorID(){
        return this.vendorID;
    }

    public String getVendorName(){
        return this.vendorName;
    }

    public String getContact() {
        return this.contact;
    }
}

