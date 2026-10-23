package com.example.torgash.infrastructure.bybit.dto;

import java.math.BigDecimal;

public class BybitTickerDto {
    public String symbol;
    public BigDecimal bid1Price;
    public BigDecimal bid1Size;
    public BigDecimal ask1Price;
    public BigDecimal ask1Size;
    public BigDecimal lastPrice;
    public BigDecimal prevPrice24h;
    public BigDecimal price24hPcnt;
    public BigDecimal highPrice24h;
    public BigDecimal lowPrice24h;
    public BigDecimal turnover24h;
    public BigDecimal volume24h;
    public BigDecimal usdIndexPrice;
}
