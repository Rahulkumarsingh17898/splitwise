package com.example.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class User extends BaseModels {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
}
