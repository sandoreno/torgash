package com.example.torgash.infrastructure.bybit;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class BybitTickerClient {

    private final RestClient restClient;

    public BybitTickerClient(RestClient.Builder builder){
        this.restClient = builder.baseUrl("https://api-testnet.bybit.com").build();
    }

    public void getTickerSecond() {

        var request = restClient
                .get()
                .uri("/v5/market/tickers?category=spot&symbol=BTCUSDT")
                .retrieve()
                .body(String.class);
        System.out.println(request);
    }
}
