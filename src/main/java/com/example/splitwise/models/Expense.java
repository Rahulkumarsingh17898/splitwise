package com.example.splitwise.models;

import jakarta.persistence.*;

import java.util.*;
@Entity
public class Expense extends BaseModels{

    private String description;
    private Double amount;
    private Date createdOn;
    @ManyToOne
    private Group group;
    @ManyToMany
    private List<User> users = new ArrayList<>();
    @OneToMany
    private List<UserExpense> paidBy = new ArrayList<>();
    @OneToMany
    private List<UserExpense> owedBy = new ArrayList<>();
//    @ElementCollection
//    private Map<User,Double> paidBy = new HashMap<>();
//    @ElementCollection
//    private Map<User,Double> owedBy = new HashMap<>();

}
