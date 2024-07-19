package com.expense.tracker.controller;

import com.expense.tracker.repository.BudgetRepository;
import com.expense.tracker.model.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/budget")
public class BudgetController {

    @Autowired
    private BudgetRepository budgetRepository;

    // GET request to retrieve all budgets for a specific user
    @GetMapping
    public List<Budget> getAllBudgets(@RequestParam Long userId) {
        return budgetRepository.findByUserId(userId);
    }

    // GET request to retrieve a specific budget by ID
    @GetMapping("/{id}")
    public Budget getBudgetById(@PathVariable Long id) {
        Optional<Budget> budget = budgetRepository.findById(id);
        return budget.orElse(null);  // Return the budget if found, otherwise return null
    }

    // POST request to add a new budget
    @PostMapping
    public Budget addBudget(@RequestBody Budget budget) {
        return budgetRepository.save(budget);
    }

    // PUT request to update an existing budget
    @PutMapping("/{id}")
    public Budget updateBudget(@PathVariable Long id, @RequestBody Budget budgetDetails) {
        Optional<Budget> optionalBudget = budgetRepository.findById(id);
        if (optionalBudget.isPresent()) {
            Budget budget = optionalBudget.get();
            budget.setAmount(budgetDetails.getAmount());
            budget.setStartDate(budgetDetails.getStartDate());
            budget.setEndDate(budgetDetails.getEndDate());
            budget.setUser(budgetDetails.getUser());
            return budgetRepository.save(budget);
        } else {
            return null;  // Return null if the budget is not found
        }
    }

    // PATCH request to partially update an existing budget
    @PatchMapping("/{id}")
    public Budget partialUpdateBudget(@PathVariable Long id, @RequestBody Budget budgetDetails) {
        Optional<Budget> optionalBudget = budgetRepository.findById(id);
        if (optionalBudget.isPresent()) {
            Budget budget = optionalBudget.get();
            if (budgetDetails.getAmount() != null) {
                budget.setAmount(budgetDetails.getAmount());
            }
            if (budgetDetails.getStartDate() != null) {
                budget.setStartDate(budgetDetails.getStartDate());
            }
            if (budgetDetails.getEndDate() != null) {
                budget.setEndDate(budgetDetails.getEndDate());
            }
            if (budgetDetails.getUser() != null) {
                budget.setUser(budgetDetails.getUser());
            }
            return budgetRepository.save(budget);
        } else {
            return null;  // Return null if the budget is not found
        }
    }

    // DELETE request to delete an existing budget
    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetRepository.deleteById(id);
    }
}
