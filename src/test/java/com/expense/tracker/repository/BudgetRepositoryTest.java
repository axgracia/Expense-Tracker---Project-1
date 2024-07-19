package com.expense.tracker.repository;

import com.expense.tracker.model.Budget;
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
public class BudgetRepositoryTest {
//
//    @Autowired
//    private BudgetRepository budgetRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    private User testUser;
//    private Budget testBudget;
//
//    @BeforeEach
//    void setUp() {
//        testUser = new User();
//        testUser.setUsername("budgetUserTest");
//        testUser.setPassword("password");
//        testUser.setEmail("budget@test.com");
//        userRepository.save(testUser);
//
//        testBudget = new Budget();
//        testBudget.setUser(testUser);
//        testBudget.setAmount(1000.00);
//        testBudget.setStartDate(LocalDate.now());
//        testBudget.setEndDate(LocalDate.now().plusMonths(1));
//        budgetRepository.save(testBudget);
//    }
//
//    @Test
//    void findByUserIdShouldReturnBudgets() {
//        List<Budget> foundBudgets = budgetRepository.findByUserId(testUser.getId());
//        assertThat(foundBudgets).isNotEmpty();
//        assertThat(foundBudgets.get(0)).isEqualTo(testBudget);
//    }
//
//    @Test
//    void saveShouldPersistBudget() {
//        Budget newBudget = new Budget();
//        newBudget.setUser(testUser);
//        newBudget.setAmount(500.00);
//        newBudget.setStartDate(LocalDate.now().minusMonths(1));
//        newBudget.setEndDate(LocalDate.now());
//        Budget savedBudget = budgetRepository.save(newBudget);
//        assertThat(savedBudget).isNotNull();
//        assertThat(savedBudget.getId()).isNotNull();
//    }
//
//    @AfterEach
//    void tearDown() {
//        budgetRepository.deleteAll();
//        userRepository.deleteAll();
//    }
}