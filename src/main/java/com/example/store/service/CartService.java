package com.example.store.service;

import java.util.List;

public interface CartService {

    void add(List<Integer> items);

    List<Integer> get();
}
