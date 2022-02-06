package com.project.bootcamp.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "tb_stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "variation")
    private Double variation;

    @Column(name = "date")
    private LocalDate date;

    public void StockItem (Long Id, String Name, Double Price, Double Variation, LocalDate Date)
    {
        this.id = Id;
        this.name = Name;
        this.price = Price;
        this.variation = Variation;
        this.date = Date;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getVariation() {
        return variation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setVariation(double variation) {
        this.variation = variation;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
