package com.rachit.bank.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid")
    private Long uuid;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "balance")
    private long balance;
    @Column(name = "opening_date")
    private String openingDate;
}
