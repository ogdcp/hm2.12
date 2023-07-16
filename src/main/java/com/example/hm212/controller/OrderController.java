package com.example.hm212.controller;

import com.example.hm212.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orederService;

    public OrderController(OrderService orederService) {
        this.orederService = orederService;
    }
    @GetMapping("/add")
    public List<Integer> addItems (@RequestParam List<Integer> items){
        return orederService.addAll(items);
    }
@GetMapping("/get")
    public List<Integer> getItems(){
        return orederService.getAll();
    }
}
