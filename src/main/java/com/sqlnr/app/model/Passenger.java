package com.sqlnr.app.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="passengers")
@Getter
@Setter
@NoArgsConstructor
public class Passenger {
    public String name;
    public String lastName;
    public Date birthDate;

    public Passenger(String name, String lastName, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
