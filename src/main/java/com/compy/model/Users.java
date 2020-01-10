package com.compy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
@Data
@EqualsAndHashCode(exclude = "userLists")
@Entity
@Table(name = "users", catalog = "test")
public class Users extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;

    @Column(unique=true)
    @NotBlank(message = "Email is mandatory")
    @Size(min = 3)
    private String email;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String mobile;
    private String remarks;
    @Column(name = "is_active")
    private Boolean isActive=Boolean.TRUE;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private List<UserList> userLists;

}
