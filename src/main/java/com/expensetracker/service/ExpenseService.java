package com.expensetracker.service;

import com.expensetracker.model.Expense;
import java.util.*;

public class ExpenseService {

    private List<Expense> expenses;

    public ExpenseService(){
        this.expenses = new ArrayList<>();
    }

    //add a new expense
    public void addExpense(Expense expense){
        expenses.add(expense);
        System.out.println("Expense added succesfully");
    }

    //get all expenses
    public List<Expense> getAllExpenses(){
        return expenses;
    }

    //Display all expenses
    public void displayAllExpenses(){
        if(expenses.isEmpty()){
            System.out.println("No expenses recorded yet");
        } else {
            System.out.println("\n All Expenses:");
            for (Expense e: expenses){
                System.out.println(e);
            }
        }
    }
}
