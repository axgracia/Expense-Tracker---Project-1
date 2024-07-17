package com.expense.tracker.repository;

import com.expense.tracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    static User findByUsername(String username) {
        return null;
    }


}