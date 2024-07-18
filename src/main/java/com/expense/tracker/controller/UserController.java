package com.expense.tracker.controller;

import java.util.List;
import com.expense.tracker.repository.UserRepository;
import com.expense.tracker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    // POST request to register a new user
    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // POST request to login a user
    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
       Optional<User> existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser.isPresent() && user.getPassword().equals(existingUser.get().getPassword())) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }

    // GET request to retrieve a user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);  // Return the user if found, otherwise return null
    }

    // PUT request to update an existing user
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUsername(userDetails.getUsername());
            user.setPassword(userDetails.getPassword());
            return userRepository.save(user);
        } else {
            return null;  // Return null if the user is not found
        }
    }

    // DELETE request to delete an existing user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}

