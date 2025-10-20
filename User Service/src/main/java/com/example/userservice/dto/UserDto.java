package com.example.userservice.dto;

import com.example.userservice.entity.Role;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String fullName;
    private String email;
    private Set<String> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
