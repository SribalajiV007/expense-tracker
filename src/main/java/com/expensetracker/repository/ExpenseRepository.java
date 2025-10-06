package com.expensetracker.repository;

import java.util.ArrayList;
import java.util.List;
import com.expensetracker.model.Expense;

public class ExpenseRepository {

    private List<Expense> expenseList;

    public ExpenseRepository(){
        this.expenseList = new ArrayList<>();
    }

    public void save(Expense expense){
        expenseList.add(expense);
    }

    public boolean deleteById(String id){
       //USING LAMBDA return expenseList.removeIf(e -> e.getId().equals(id));
        for (int i = 0; i < expenseList.size(); i++) {
            Expense e = expenseList.get(i);
            if (e.getId().equals(id)) {
                expenseList.remove(i);
                return true; // found and deleted
            }
        }
        return false;
    }

    //Get all expenses
    public List<Expense> findAll(){
        return new ArrayList<>(expenseList);
    }

    //Find by category
    public List<Expense> findByCategory(String categoryName){
        List<Expense> filtered = new ArrayList<>();
        for(Expense e : expenseList){
            if(e.getCategory().name().equalsIgnoreCase(categoryName)) {
                filtered.add(e);
            }
        }
        return filtered;
    }
}
