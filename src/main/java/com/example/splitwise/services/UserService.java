package com.example.splitwise.services;

import com.example.splitwise.models.User;
import com.example.splitwise.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public User createUser(User user){
     return userRepository.save(user);
    }
}
