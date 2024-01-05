package com.example.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserExpense  extends BaseModels{
    @ManyToOne
    private User user;

    @ManyToOne
    private Expense expense;

    private Double amount;

    @Enumerated
    private ExpenseType type;
}
