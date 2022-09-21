package com.system.exams.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * User Entity
 *
 * @author Andre Gallegos
 * @create 2022-09-20 17:47
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private boolean enabled = true;
    private String profile;

    /*When I affect User it will affect UserRole as well.*/
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private Set<UserRole> userRoles = new HashSet<>();
}
