package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense) {
        if (expense.getAmount() <= 0) {
            throw new InvalidExpenseException("amount less than zero is not allowed.");
        }
        expenseRepository.addExpense(expense);

    }

    public ArrayList<Expense> getAllExpense() {
        return expenseRepository.returnAllExpense();
    }

    public Expense findExpenseById(int id) {
        Expense expense = expenseRepository.findExpense(id);
        if (expense == null) {
            throw new ExpenseNotFoundException("expense id not found.");
        }
        return expense;
    }

    public String deletingExpenseById(int id) {
        boolean deletion = expenseRepository.deletingExpense(id);
        if (deletion) {
            return "deletion successful";
        }
        return "deletion failed";
    }

    public double totalExpense() {
        double totalExpense = 0;
        ArrayList<Expense> list = expenseRepository.returnAllExpense();
        for (Expense e : list) {
            totalExpense += e.getAmount();

        }
        return totalExpense;
    }
}
