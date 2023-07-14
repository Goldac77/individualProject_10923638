package com.example.individualproject_10923638;

public class IssuedGoods {
    private static int issue_id;
    private int quantity;
    private String bill_date;
    private int count = 1;
    public IssuedGoods(int quantity, String bill_date) {
        this.quantity = quantity;
        this.bill_date = bill_date;
        issue_id = count++;
    }

    public int getIssue_id() {
        return issue_id;
    }
}
