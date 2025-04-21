package com.zidio.expense_management.controller;
import com.zidio.expense_management.entity.Approval;
import com.zidio.expense_management.entity.Expense;
import com.zidio.expense_management.service.ApprovalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/approvals")
@RequiredArgsConstructor
public class ApprovalController {
    private final ApprovalService approvalService;

    // Approve or reject an expense (create approval record)
    @PostMapping
    public ResponseEntity<Approval> saveApproval(@RequestBody Approval approval) {
        return ResponseEntity.ok(approvalService.saveApproval(approval));
    }

    // Get approvals for a specific expense
    @GetMapping("/expense/{expenseId}")
    public ResponseEntity<List<Approval>> getApprovalsByExpense(@PathVariable Long expenseId) {
        Expense expense = new Expense();
        expense.setId(expenseId);
        return ResponseEntity.ok(approvalService.getApprovalsByExpense(expense));
    }

    // Get all approvals
    @GetMapping
    public ResponseEntity<List<Approval>> getAllApprovals() {
        return ResponseEntity.ok(approvalService.getAllApprovals());
    }
}
