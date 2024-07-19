package com.expense.tracker.repository;

import com.expense.tracker.model.Category;
import com.expense.tracker.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CategoryRepositoryTest {
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    private User testUser;
//    private Category testCategory;
//
//    @BeforeEach
//    void setUp() {
//        testUser = new User();
//        testUser.setUsername("categoryUserTest");
//        testUser.setPassword("password");
//        testUser.setEmail("category@test.com");
//        userRepository.save(testUser);
//
//        testCategory = new Category();
//        testCategory.setName("Test Category");
//        testCategory.setDescription("Test Description");
//        testCategory.setUser(testUser);
//        categoryRepository.save(testCategory);
//    }
//
//    @Test
//    void findAllShouldReturnAllCategories() {
//        List<Category> categories = categoryRepository.findAll();
//        assertThat(categories).isNotEmpty();
//        assertThat(categories.contains(testCategory)).isTrue();
//    }
//
//    @Test
//    void findByIdShouldReturnCorrectCategory() {
//        Optional<Category> foundCategory = categoryRepository.findById(testCategory.getId());
//        assertThat(foundCategory.isPresent()).isTrue();
//        assertThat(foundCategory.get()).isEqualTo(testCategory);
//    }
//
//    @Test
//    void saveShouldPersistCategory() {
//        Category newCategory = new Category();
//        newCategory.setName("New Test Category");
//        newCategory.setDescription("New Description");
//        newCategory.setUser(testUser);
//        Category savedCategory = categoryRepository.save(newCategory);
//        assertThat(savedCategory).isNotNull();
//        assertThat(savedCategory.getId()).isNotNull();
//    }
//
//    @AfterEach
//    void tearDown() {
//        categoryRepository.deleteAll();
//        userRepository.deleteAll();
//    }
}