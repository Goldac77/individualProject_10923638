package com.example.individualproject_10923638;

public class Vendors {
    private int vendor_id;
    private String name;
    private String contact_info;
    private static int count = 1;

    public Vendors(String name, String contact_info) {
        this.name = name;
        this.contact_info = contact_info;
        vendor_id = count++;
    }

    public int getVendor_id() {
        return vendor_id;
    }
}
