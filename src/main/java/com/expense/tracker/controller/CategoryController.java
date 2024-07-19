package com.expense.tracker.controller;


import com.expense.tracker.repository.CategoryRepository;
import com.expense.tracker.model.Category;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if(categoryOptional.isEmpty()){
            throw new RuntimeException("Category with " + id +"not found");
        }
        return categoryOptional.get();
    }


    @PostMapping("/categories") //FIX
    public Category addCategory(@RequestBody @Valid Category category) {
        return categoryRepository.save(category);
    }




//
//    @PutMapping("/{id}")
//    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
//        category.setId(id);
//        return categoryRepository.save(category);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteCategory(@PathVariable Long id) {
//        categoryRepository.deleteById(id);
//    }
}
