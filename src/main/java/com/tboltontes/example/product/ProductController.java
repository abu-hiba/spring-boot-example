package com.tboltontes.example.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Currency;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @GetMapping
    public List<Product> getProduct() throws MalformedURLException {
        return List.of(
                new Product(1L,
                        "iPhone 15",
                        Currency.getInstance("GBP"),
                        new BigDecimal("999.00"),
                        "The latest mobile phone from Apple",
                        new URL(
                                "https://images.unsplash.com/photo-1695048065127-fbee942eed2e?"
                                        + "q=80&w=3570&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wx"
                                        + "MjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
                        )
                )
        );
    }
}
