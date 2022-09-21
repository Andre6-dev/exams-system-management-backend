package com.system.exams;

import com.system.exams.model.Role;
import com.system.exams.model.User;
import com.system.exams.model.UserRole;
import com.system.exams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamsSystemManagementApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExamsSystemManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setName("Andre");
        user.setSurname("Gallegos");
        user.setUsername("andre");
        user.setPassword("123456");
        user.setEmail("andre@gmail.com");
        user.setPhone("123456789");
        user.setProfile("default.png");

        Role role = new Role();
        role.setRoleId(1L);
        role.setName("ADMIN");

        /*Assign Role*/
        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRole.setRole(role);
        userRole.setUser(user);
        userRoles.add(userRole);

        User savedUser = userService.saveUser(user, userRoles);
        System.out.println(savedUser.getUsername());
    }
}
