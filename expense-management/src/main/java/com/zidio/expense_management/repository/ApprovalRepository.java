package com.zidio.expense_management.repository;
import com.zidio.expense_management.entity.Approval;
import com.zidio.expense_management.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApprovalRepository extends JpaRepository<Approval , Long> {
    List<Approval> findByExpense(Expense expense);
}
