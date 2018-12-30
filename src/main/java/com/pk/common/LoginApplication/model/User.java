package com.pk.common.LoginApplication.model;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String userName;
    @Column
    String hashpasssword;

    Role role;
}
