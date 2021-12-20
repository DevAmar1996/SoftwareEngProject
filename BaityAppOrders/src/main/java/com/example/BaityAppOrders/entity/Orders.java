package com.example.BaityAppOrders.entity;

import com.example.BaityAppOrders.VO.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Float price ;
    private double latitude ;
    private double longitude ;
    @ElementCollection
    private Collection<Integer> products;
}
