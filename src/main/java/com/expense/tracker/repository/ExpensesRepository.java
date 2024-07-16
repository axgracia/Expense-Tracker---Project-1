package com.expense.tracker.repository;

import com.expense.tracker.Model.Expenses;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses, Long> {
    List<Expenses> findByUserId(Long userId);
}
