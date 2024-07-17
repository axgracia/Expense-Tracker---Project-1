package com.expense.tracker.controller;

import com.expense.tracker.Model.Expenses;
import com.expense.tracker.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesRepository expensesRepository;

    @GetMapping
    public List<Expenses> getAllExpenses(@RequestParam Long userId) {
        return expensesRepository.findByUserId(userId);
    }

    @PostMapping
    public Expenses addExpense(@RequestBody Expenses expense) {
        return expensesRepository.save(expense);
    }

    @PutMapping("/{id}")
    public Expenses updateExpenses(@PathVariable Long id, @RequestBody Expenses expenses) {
        expenses.setId(id);
        return expensesRepository.save(expenses);
    }

    @DeleteMapping("/{id}")
    public void deleteExpenses(@PathVariable Long id) {
        expensesRepository.deleteById(id);
    }
}
