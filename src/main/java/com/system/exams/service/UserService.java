package com.system.exams.service;

import com.system.exams.model.User;
import com.system.exams.model.UserRole;

import java.util.Set;

/**
 * User Interface who handles all the business logic for user
 *
 * @author Andre Gallegos
 * @create 2022-09-20 19:22
 **/
public interface UserService {

    public User saveUser(User user, Set<UserRole> userRoles) throws Exception;

}
