package com.example.BaityAppOrders.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id ;
    private String name ;
    private Float price ;
    private int quantity ;

}
