package com.zidio.expense_management.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;


}
