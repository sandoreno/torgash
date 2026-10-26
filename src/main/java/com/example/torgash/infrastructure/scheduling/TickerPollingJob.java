package com.example.torgash.infrastructure.scheduling;


import com.example.torgash.infrastructure.bybit.BybitTickerClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TickerPollingJob {

    BybitTickerClient client;

    public TickerPollingJob(BybitTickerClient _client){
        this.client = _client;
    }

    @Scheduled(fixedRate = 1000)
    public void tickerPollingScheduler() {
        client.getTickerSecond();
    }
}
