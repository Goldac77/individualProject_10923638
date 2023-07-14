package com.example.individualproject_10923638;

public class Categories {
    private static int cat_id;
    private String name;
    private int count = 1;

    public Categories(String name) {
        this.name = name;
        cat_id = count++;
    }

    public static int getCat_id() {
        return cat_id;
    }
}
