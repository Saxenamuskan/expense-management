package com.zidio.expense_management.repository;
import com.zidio.expense_management.entity.Expense;
import com.zidio.expense_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUser(User user);
}
