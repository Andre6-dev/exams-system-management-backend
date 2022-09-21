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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    private Role role;

}
