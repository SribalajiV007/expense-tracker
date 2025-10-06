package com.expensetracker.service;

import com.expensetracker.model.Expense;
import com.expensetracker.repository.ExpenseRepository;

import java.util.*;

public class ExpenseService {

    private ExpenseRepository repository;

    public ExpenseService(){
        this.repository = new ExpenseRepository();
    }

    //add a new expense
    public void addExpense(Expense expense){
        repository.save(expense);
        System.out.println("Expense added succesfully");
    }

    //Display all expenses
    public void displayAllExpenses(){
        List<Expense> expenses = repository.findAll();
        if(expenses.isEmpty()){
            System.out.println("No expenses recorded yet");
        } else {
            System.out.println("\n All Expenses:");
            for (Expense e: expenses){
                System.out.println(e);
            }
        }
    }

    //Delete an expense by ID
    public void deleteExpense(String id){
        boolean removed = repository.deleteById(id);
        if(removed) {
            System.out.println("Expense deleted successfully!");
        } else {
            System.out.println("Expense not found with ID: "+ id);
        }
    }
}
