package com.expense.tracker.repository;

import com.expense.tracker.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpensesRepository extends JpaRepository<Expenses, Long> {

    List<Expenses> findByUserId(Long userId);
}
