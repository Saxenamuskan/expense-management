package com.zidio.expense_management.entity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
@Entity
@Table(name = "approvals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Approval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;

    @ManyToOne
    @JoinColumn(name = "approver_id")
    private User approver;

    private String level; // MANAGER, FINANCE, ADMIN

    private String status; // APPROVED, REJECTED, PENDING

    private LocalDateTime approvedAt;
}
