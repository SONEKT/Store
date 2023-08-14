package com.example.store.controller;

import com.example.store.service.Cart;
import com.example.store.service.CartService;

import java.util.List;

@RestController // не понимаю почему restcontroller не работает
@Requestmap("/order")// это тоже не работает
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add") //не работает
    public String add(@RequestParam List<Integer> items) { //RequestParam не работает
        cartService.add(items);
        return "Товары добавлены в корзину";
    }
@GetMapping("/get") //не работает
    public List<Integer> get() {
        return cartService.get();
    }
}
