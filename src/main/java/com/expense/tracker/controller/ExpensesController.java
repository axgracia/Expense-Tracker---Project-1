package com.expense.tracker.controller;

import com.expense.tracker.Model.Expenses;
import com.expense.tracker.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ExpensesController {

    @Autowired
    private ExpensesRepository expensesRepository;

    @GetMapping
    public List<Expenses> getAllExpenses(@RequestParam Long userId) {
        return expensesRepository.findByUserId(userId);
    }

    @GetMapping("/{id}")
    public Expenses getExpenseById(@PathVariable Long id) {
        Optional<Expenses> expense = expensesRepository.findById(id);
        return expense.orElse(null);  // Return the expense if found, otherwise return null
    }

    @PostMapping
    public Expenses addExpenses(@RequestBody Expenses expenses) {
        return expensesRepository.save(expenses);
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
