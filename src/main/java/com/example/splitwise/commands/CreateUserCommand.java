package com.example.splitwise.commands;

import com.example.splitwise.controller.UserController;
import com.example.splitwise.dtos.CreateUserRequest;
import com.example.splitwise.models.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
@AllArgsConstructor
public class CreateUserCommand implements Command{

    private UserController userController;
    @Override
    public boolean matches(String input) {
        List<String> tokens = Arrays.stream(input.split(" ")).toList();
        String command = tokens.get(0);
        if(!command.equals(Commands.REGISTER_USER_COMMAND)){
            return false;
        }
        if(tokens.size()<5){
            return false;
        }
        return true;
    }

    @Override
    public void execute(String input) {
        //        register rahul rahul@tat 546 91456
        System.out.println("executing create user Command");
        List<String> tokens = Arrays.stream(input.split(" ")).toList();
        CreateUserRequest request = CreateUserRequest.builder()
                .name(tokens.get(1))
                .email(tokens.get(2))
                .password(tokens.get(3))
                .phoneNumber(tokens.get(4))
                .build();
        User user = userController.createUser(request);

        System.out.println("Created user with id "+user.getId());

    }
}
