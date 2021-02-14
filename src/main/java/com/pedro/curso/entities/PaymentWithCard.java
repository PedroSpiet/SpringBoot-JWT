package com.pedro.curso.entities;

import javax.persistence.Entity;

@Entity
public class PaymentWithCard extends Payment{

    private static final long serialVersionUID = 1L;

    private Integer plotsNumber;

    public PaymentWithCard() {}

    public PaymentWithCard(Long id, PaymentStatus status, Order order, Integer plotsNumber) {
        super(id, status, order);
        this.plotsNumber = plotsNumber;
    }

    public Integer getPlotsNumber() {
        return plotsNumber;
    }

    public void setPlotsNumber(Integer plotsNumber) {
        this.plotsNumber = plotsNumber;
    }
}
