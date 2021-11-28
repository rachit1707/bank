package com.rachit.bank.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid")
    private Long uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "dob")
    private String dob;
    @Column(name = "contact")
    private String contact;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "account_no")
    @JoinTable(name = "account", joinColumns = @JoinColumn(name = "uuid"))
    private long accountNo;
}
