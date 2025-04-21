package com.zidio.expense_management.dto;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class AuthRequest {
    private String username;
    private String password;
    // Getters and Setters (or use Lombok @Data)
}
