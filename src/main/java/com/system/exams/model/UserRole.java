package com.system.exams.model;

import lombok.*;

import javax.persistence.*;

/**
 * Handle the ids of the user and roles
 *
 * @author Andre Gallegos
 * @create 2022-09-20 18:19
 **/
@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Role role;

}
