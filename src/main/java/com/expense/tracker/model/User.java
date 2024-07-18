package com.expense.tracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Password is required")
    private String password;
    @Email(message = "Invalid email") //@gmail.com
    private String email;

    @NotEmpty(message = "Expenses cannot be empty")
    //@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Expenses> expenses;
    @NotEmpty(message = "Categories cannot be empty")
    //@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Category> categories;

    @NotEmpty(message = "Budgets cannot be empty")
    //@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Budget> budgets;

    // Validation Examples
    //@Min(value = 0)
    //@Max(value = 100)
    //@Email
    //@NotBlank //strings
    //@NotEmpty

}
