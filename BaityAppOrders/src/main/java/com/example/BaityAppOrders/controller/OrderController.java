package com.example.BaityAppOrders.controller;

import com.example.BaityAppOrders.VO.ResponseTemplateVO;
import com.example.BaityAppOrders.entity.Orders;
import com.example.BaityAppOrders.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public Orders saveOrder(@RequestBody Orders order) {
        log.info("Inside saveOrder in Product Controller");
        return  orderService.saveOrder(order);

    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findOrderById(@PathVariable("id") Long id) {
        log.info("Inside ResponseTemplateVO in Product Controller");
        return orderService.findOrderById(id);
    }

    @GetMapping("/")
    public List<Orders> getAllOrders() {
        log.info("Inside findProductById in ProductService");
        return orderService.getAllOrders();
    }
}
