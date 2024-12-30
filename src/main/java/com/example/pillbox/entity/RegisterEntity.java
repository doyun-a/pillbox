package com.example.pillbox.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RegisterEntity {

    @Id
    @GeneratedValue
    private int id;

    private String PillName;
}
