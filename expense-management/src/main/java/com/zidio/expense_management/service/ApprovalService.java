package com.zidio.expense_management.service;
import com.zidio.expense_management.entity.Approval;
import com.zidio.expense_management.entity.Expense;
import com.zidio.expense_management.repository.ApprovalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApprovalService {
    private final ApprovalRepository approvalRepository;

    public Approval saveApproval(Approval approval) {
        return approvalRepository.save(approval);
    }

    public List<Approval> getApprovalsByExpense(Expense expense) {
        return approvalRepository.findByExpense(expense);
    }

    public List<Approval> getAllApprovals() {
        return approvalRepository.findAll();
    }
}
