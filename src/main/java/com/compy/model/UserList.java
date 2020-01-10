package com.compy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;

@Data
@Table(name = "users_lists", catalog = "test")
@Entity
public class UserList extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private Integer id;

    @URL(protocol = "http")
    private String profileUrl;

    private String listName;

    @JsonIgnore
    @Column(name = "user_id")
    private Integer userId;

}
