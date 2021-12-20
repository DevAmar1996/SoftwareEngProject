package com.example.BaityAppOrders.service;

import com.example.BaityAppOrders.VO.Product;
import com.example.BaityAppOrders.VO.ProductList;
import com.example.BaityAppOrders.VO.ResponseTemplateVO;
import com.example.BaityAppOrders.entity.Orders;
import com.example.BaityAppOrders.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;
//    private ProductOrderRepository productOrderRepository;

    public Orders saveOrder(Orders order) {
        log.info("Inside saveProduct in ProductService");
        return orderRepository.save(order);
    }

//    public List<OrderProduct> saveProductOrder(List<OrderProduct> orderProducts) {
//        log.info("Inside saveProduct in ProductService");
//        return productOrderRepository.saveAll(orderProducts);
//    }

    public ResponseTemplateVO findOrderById(@PathVariable("id") Long id) {
        log.info("Inside findOrderById in ProductService");
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Orders orders = orderRepository.findOrderById(id);
        System.out.println(orders);
//        ProductList products = restTemplate.getForObject("http://localhost://9094/products/"+orders.getProducts(), ProductList.class);
        StringBuilder productIds = new StringBuilder();
        for (Integer productId : orders.getProducts())
        {
            productIds.append(productId).append(",");
        }

        System.out.println(productIds.substring(0, productIds.length() - 1));
        List<Product> products = (List<Product>) restTemplate.getForObject("http://localhost:9097/products/some/"+productIds.substring(0, productIds.length() - 1), List.class) ;
        System.out.println(products);
        responseTemplateVO.setOrder(orders);
        responseTemplateVO.setProducts(products);
        return responseTemplateVO;
    }

    public List<Orders> getAllOrders() {
        log.info("Inside getAllOrders in ProductService");
//        List<Orders> orders = List
//        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        return orderRepository.findAll();
    }
}
