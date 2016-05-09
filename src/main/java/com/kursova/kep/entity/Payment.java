package com.kursova.kep.entity;

import java.sql.Date;

public class Payment extends BaseEntity {

    private Date dayOfPayment;
    private Date lastPayment;
    private Integer currentMeter;
    private Integer lastMeter;
    private Integer limit;
    private Integer reuseLimit;
    private Double debt;
    private Integer amountForPayment;
    private Subscribers subscribers;

    public Payment() {
    }

    public Payment(
            Long id,
            Date dayOfPayment,
            Date lastPayment,
            Integer currentMeter,
            Integer lastMeter,
            Integer limit,
            Integer reuseLimit,
            Double debt,
            Integer amountForPayment,
            Subscribers subscribers
    ) {
        this.id = id;
        this.dayOfPayment = dayOfPayment;
        this.lastPayment = lastPayment;
        this.currentMeter = currentMeter;
        this.lastMeter = lastMeter;
        this.limit = limit;
        this.reuseLimit = reuseLimit;
        this.debt = debt;
        this.amountForPayment = amountForPayment;
        this.subscribers = subscribers;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public Date getDayOfPayment() {
        return dayOfPayment;
    }

    public void setDayOfPayment(Date dayOfPayment) {
        this.dayOfPayment = dayOfPayment;
    }

    public Date getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(Date lastPayment) {
        this.lastPayment = lastPayment;
    }

    public Integer getCurrentMeter() {
        return currentMeter;
    }

    public void setCurrentMeter(Integer currentMeter) {
        this.currentMeter = currentMeter;
    }

    public Integer getLastMeter() {
        return lastMeter;
    }

    public void setLastMeter(Integer lastMeter) {
        this.lastMeter = lastMeter;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getReuseLimit() {
        return reuseLimit;
    }

    public void setReuseLimit(Integer reuseLimit) {
        this.reuseLimit = reuseLimit;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    public Integer getAmountForPayment() {
        return amountForPayment;
    }

    public void setAmountForPayment(Integer amountForPayment) {
        this.amountForPayment = amountForPayment;
    }

    public Subscribers getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Subscribers subscribers) {
        this.subscribers = subscribers;
    }
}
