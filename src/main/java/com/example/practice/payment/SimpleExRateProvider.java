package com.example.practice.payment;

import java.math.BigDecimal;

public class SimpleExRateProvider implements IExRateProvider {
    @Override
    public BigDecimal getExRate(String currency) {
        if (currency.equals("USD")) {
            return new BigDecimal("1000");
        }

        throw new IllegalArgumentException("Unsupported currency: " + currency);
    }
}
