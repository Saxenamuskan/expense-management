package com.zidio.expense_management.controller;
import com.zidio.expense_management.entity.Expense;
import com.zidio.expense_management.entity.User;
import com.zidio.expense_management.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
@RequiredArgsConstructor
public class ExpenseController {
    private final ExpenseService expenseService;

    // Create a new expense
    @PostMapping
    public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense) {
        Expense saved = expenseService.saveExpense(expense);
        return ResponseEntity.ok(saved);
    }

    // Get expenses by user
    @GetMapping("/user")
    public ResponseEntity<List<Expense>> getExpensesByUser(@RequestBody User user) {
        List<Expense> expenses = expenseService.getExpensesByUser(user);
        return ResponseEntity.ok(expenses);
    }

    // Get all expenses
    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses() {
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }
}
