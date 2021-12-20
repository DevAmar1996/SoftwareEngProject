package com.example.BaityAppOrders.VO;

import com.example.BaityAppOrders.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Orders order;
    private List<Product> products;
}
