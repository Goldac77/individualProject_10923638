package com.example.individualproject_10923638;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;

public class Main {
    private Connection connection;
    HashMap<Integer, String> Category_Map;
    Stacks<Products> stacks;
    HashMap<Integer, Categories> Categories;

    public Main(String url, String username, String password) {
        Category_Map = new HashMap<>();
        stacks = new Stacks();
        connectToDatabase(url, username, password);
        Category_Map.put(1, "Beverages");
        Category_Map.put(2, "Bread");
        Category_Map.put(3, "Canned");
        Category_Map.put(4, "Dairy");
        Category_Map.put(5, "Dry");
        Category_Map.put(6, "Frozen");
        Category_Map.put(7, "Meat");
        Category_Map.put(8, "Farm produce");
        Category_Map.put(9, "Home cleaners");
        Category_Map.put(10, "Paper");
        Category_Map.put(11, "Home care");
    }

    public void connectToDatabase(String url, String username, String password){
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully");
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void addProduct(String productName, String categoryName, int quantity, int unitPrice) {
        int category_map_key = -1;  // Default value if category is not found

        Products products = new Products(productName, quantity, unitPrice);

        // Check if the categoryName exists in the Category_Map
        for (Map.Entry<Integer, String> entry : Category_Map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(categoryName)) {
                category_map_key = entry.getKey();
                break;
            }
        }

        if (category_map_key != -1) {
            Categories categories = new Categories(categoryName);
            if(category_map_key >=1 && category_map_key <=4) {
                stacks.push(products);
            }
        }else {
            System.out.println("Invalid category name: " + categoryName);
        }
    }

    public void removeProduct(String categoryName) {
        int category_map_key = -1;  // Default value if category is not found

        // Check if the categoryName exists in the Category_Map
        for (Map.Entry<Integer, String> entry : Category_Map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(categoryName)) {
                category_map_key = entry.getKey();
                break;
            }
        }

        if (category_map_key != -1) {
            if(category_map_key >=1 && category_map_key <=4) {
                stacks.pop();
            }
        }else {
            System.out.println("Invalid category name: " + categoryName);
        }
    }

    public void viewGoods() {

    }
}
