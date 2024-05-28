package models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CryptoModel {
    private String symbol;
    private String name;
    private double priceUsd;
    private double volume24hUsd;
    private double marketCapUsd;
    private double percentChange1h;
    private double percentChange24h;
    private double percentChange7d;
}

