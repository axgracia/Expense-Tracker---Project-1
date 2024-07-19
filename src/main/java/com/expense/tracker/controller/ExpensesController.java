package com.expense.tracker.controller;

import com.expense.tracker.model.Expenses;
import com.expense.tracker.repository.ExpensesRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ExpensesController {

    @Autowired
    private ExpensesRepository expensesRepository;
//************************************************************************ GET
    @GetMapping("/expenses")
    public List<Expenses> getAllExpenses() {
        return expensesRepository.findAll();
    }

    @GetMapping("/expenses/{id}")
    public Expenses getExpenseById(@PathVariable Long id) {
        Optional<Expenses> expenseOptional = expensesRepository.findById(id);
        if(expenseOptional.isEmpty()){
            throw new RuntimeException("Expense with " + id +"not found");
        }
        return expenseOptional.get();
    }

    //************************************************************************ POST

    @PostMapping("/expenses") //FIX
    public Expenses addExpenses(@RequestBody @Valid Expenses expenses) {
        return expensesRepository.save(expenses);
    }

    @PutMapping("/expenses/{id}")
    public Expenses updateExpenses(@PathVariable Long id, @RequestBody Expenses expenses) {
        expenses.setId(id);
        return expensesRepository.save(expenses);
    }

    @DeleteMapping("/{id}")
    public void deleteExpenses(@PathVariable Long id) {
        expensesRepository.deleteById(id);
    }
}
