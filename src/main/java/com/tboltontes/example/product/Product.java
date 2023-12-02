package com.tboltontes.example.product;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Currency;

public class Product {
    private Long id;
    private String name;
    private Currency currency;
    private BigDecimal price;
    private String description;
    private URL image;

    public Product() {
    }

    public Product(Long id, String name, Currency currency, BigDecimal price, String description, URL image) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public Product(String name, Currency currency, BigDecimal price, String description, URL image) {
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currency=" + currency +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}
