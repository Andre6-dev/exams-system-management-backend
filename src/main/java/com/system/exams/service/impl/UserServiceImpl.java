package com.system.exams.service.impl;

import com.system.exams.model.User;
import com.system.exams.model.UserRole;
import com.system.exams.repository.RoleRepository;
import com.system.exams.repository.UserRepository;
import com.system.exams.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * User Service Implementation for methods
 *
 * @author Andre Gallegos
 * @create 2022-09-20 19:28
 **/
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user, Set<UserRole> userRoles) throws Exception {
        User userLocal = userRepository.findByUsername(user.getUsername());

        if (userLocal != null) {
            System.out.println("User is already there");
            throw new Exception("User is already there");
        } else {
            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            userLocal = userRepository.save(user);
        }

        return userLocal;
    }
}
