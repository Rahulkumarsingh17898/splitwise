package com.example.splitwise;

import com.example.splitwise.commands.CommandExecutor;
import com.example.splitwise.commands.CreateUserCommand;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Scanner;

@SpringBootApplication
@EnableJpaAuditing
public class SplitwiseApplication implements CommandLineRunner {
    private Scanner sc;
    private CommandExecutor commandExecutor;
    public SplitwiseApplication(CommandExecutor commandExecutor,CreateUserCommand command) {
        this.sc = new Scanner(System.in);
        this.commandExecutor=commandExecutor;
        this.commandExecutor.addCommand(command);
    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        while (true){
            System.out.println("Enter input:");
            String input = sc.nextLine();

            System.out.println("User entered:"+input);
            this.commandExecutor.execute(input);
        }
    }
}
