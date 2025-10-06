package com.expensetracker.model;

import java.time.LocalDate;
import java.util.UUID;

public class Expense {
    private String id;
    private String description;
    private double amount;
    private LocalDate date;
    private Category category;

    public Expense(String description, double amount, LocalDate date, Category category) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public String getId(){ return id; }
    public String getDesription(){ return description; }
    public double getAmount(){ return amount; }
    public LocalDate getDate() { return date; }
    public Category getCategory() { return category; }

    public void setDescription(String description){ this.description = description; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDate(LocalDate date) { this.date = date; }
    public void SetCategory(Category category) { this.category = category; }

    @Override
    public String toString() {
        return String.format("[%s] %s - ₹%.2f (%s) on %s",
                id.substring(0, 8),
                description,
                amount,
                category,
                date);
    }


}

