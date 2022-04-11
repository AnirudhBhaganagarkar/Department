package com.cygnet.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departement
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String departementName;
    private String departementAddress;
    private String departementCode;

}
