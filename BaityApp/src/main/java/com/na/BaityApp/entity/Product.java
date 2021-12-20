package com.na.BaityApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name ;
    private Float price ;
    private int quantity ;
    @ElementCollection
    private Collection<Integer> departments;
    @ElementCollection
    private Collection<String> images;

}
