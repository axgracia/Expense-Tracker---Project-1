package com.expense.tracker.repository;

import com.expense.tracker.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class UserRepositoryTest {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    private User testUser;
//
//    @BeforeEach
//    void setUp() {
//        testUser = new User();
//        testUser.setUsername("testUser");
//        // Set other required fields of User
//        userRepository.save(testUser);
//    }
//
//    @Test
//    void findByUsernameShouldReturnUser() {
//        Optional<User> foundUser = userRepository.findByUsername("testUser");
//        assertThat(foundUser).isPresent();
//        assertThat(foundUser.get().getUsername()).isEqualTo(testUser.getUsername());
//    }
//
//    @AfterEach
//    void tearDown() {
//        userRepository.deleteAll();
//    }
//
}