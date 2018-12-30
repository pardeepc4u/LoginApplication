package com.pk.common.LoginApplication.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table
public class Role {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column
    String role;
}
