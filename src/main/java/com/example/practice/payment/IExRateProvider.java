package com.example.practice.payment;

import java.math.BigDecimal;

public interface IExRateProvider {
    BigDecimal getExRate(String currency);
}
