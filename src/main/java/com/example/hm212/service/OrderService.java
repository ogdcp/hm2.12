package com.example.hm212.service;

import java.util.List;

public interface OrderService {
    List<Integer> addAll(List<Integer> idList);
    List<Integer> addAll();

    List<Integer> getAll();
}
