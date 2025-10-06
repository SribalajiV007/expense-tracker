package com.expensetracker;

import com.expensetracker.model.*;
import java.time.LocalDate;
import com.expensetracker.service.ExpenseService;


public class Main {
    public static void main(String[] args) {
       ExpenseService service = new ExpenseService();

       Expense e1 = new Expense("Dinner with friends", 500, LocalDate.now(),Category.FOOD);
       Expense e2 = new Expense("Bus Ticket",45.0,LocalDate.now(), Category.TRANSPORT);

       service.addExpense(e1);
       service.addExpense(e2);

       service.displayAllExpenses();

    }
}