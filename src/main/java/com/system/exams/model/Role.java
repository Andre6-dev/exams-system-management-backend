package com.system.exams.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Role Entity to handle the role's name
 *
 * @author Andre Gallegos
 * @create 2022-09-20 18:18
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    private Long roleId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
    private Set<UserRole> userRoles = new HashSet<>();
}
