package com.example.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "expense_groups")
public class Group extends BaseModels{

    private String name;
    @ManyToOne
    private User createdBy;
    @ManyToMany
    private List<User> members = new ArrayList<>();
    @ManyToMany
    private List<User> admins = new ArrayList<>();


}
