package com.codegym.model;

public class CurrencyConversion {
    private double amount;
    private double rate;
    private double total;

    public CurrencyConversion() {
    }

    public CurrencyConversion(double amount, double rate, double total) {
        this.amount = amount;
        this.rate = rate;
        this.total = total;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ket qua quy doi: " +
                "tien goc=" + amount +
                ", ty gia=" + rate +
                ", quy doi=" + total ;
    }
}
