package com.example.store.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope //У меня нет SessionScope или другие скоупы только этот
public class Cart {

    private List<Integer> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void add(Integer item) {
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
