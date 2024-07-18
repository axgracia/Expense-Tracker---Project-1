package com.expense.tracker.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Min(value = 1, message = "Amount must be greater than 0")
    private Double amount;
    @NotBlank(message = "Description is required")
    private String description;
    @NotBlank(message = "Date is required")
    private LocalDate date;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}