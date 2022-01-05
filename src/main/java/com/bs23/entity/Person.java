package com.bs23.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

@Getter
@Setter
@Table
@Entity(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long Id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "HEIGHT")
    private String height;

    @Column(name = "ADDRESS")
    private String address;
}
