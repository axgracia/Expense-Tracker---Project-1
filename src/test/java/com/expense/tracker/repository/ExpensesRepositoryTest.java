package com.expense.tracker.repository;

import com.expense.tracker.model.Category;
import com.expense.tracker.model.Expenses;
import com.expense.tracker.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ExpensesRepositoryTest {
//
//    @Autowired
//    private ExpensesRepository expensesRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    private User testUser;
//
//    @BeforeEach
//    void setUp() {
//        // Create and save a User
//        testUser = new User();
//        testUser.setUsername("userForExpensesTest");
//        testUser.setPassword("password");
//        testUser.setEmail("test@example.com");
//        userRepository.save(testUser);
//
//        // Create and save Expenses linked to the User
//        Expenses expense = new Expenses();
//        expense.setUser(testUser);
//        expense.setAmount(200.00); // Example amount
//        expense.setDescription("Computer Monitor"); // Example description
//        expense.setDate(LocalDate.now());// Use the current date for simplicity
//        Category work = new Category();
//        expense.setCategory(work);
//        expensesRepository.save(expense);
//    }
//
//    @Test
//    void findByUserIdShouldReturnExpenses() {
//        List<Expenses> foundExpenses = expensesRepository.findByUserId(testUser.getId());
//        assertThat(foundExpenses).isNotEmpty();
//        assertThat(foundExpenses.get(0).getUser()).isEqualTo(testUser);
//    }
//
//    @AfterEach
//    void tearDown() {
//        // Clean up the database
//        expensesRepository.deleteAll();
//        userRepository.deleteAll();
//    }
//
}
