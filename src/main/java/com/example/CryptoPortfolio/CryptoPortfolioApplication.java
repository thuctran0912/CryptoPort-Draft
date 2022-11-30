package com.example.CryptoPortfolio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.CryptoPortfolio.model.Crypto;
import com.example.CryptoPortfolio.model.CryptoRepository;

@SpringBootApplication
public class CryptoPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoPortfolioApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner cryptoDemo(CryptoRepository repository) {
		return (args) -> {
			Crypto coin1 = new Crypto("Bitcoin", "BTC", 19000,1,"09-12-2021");
			Crypto coin2 = new Crypto("Ethereum","ETH",1200,10,"08-11-2021");
			Crypto coin3 = new Crypto("Binance Coin","BNB",200,100,"07-12-2020");
			Crypto coin4 = new Crypto("Bitcoin", "BTC", 18000,1,"09-12-2022");
			Crypto coin5 = new Crypto("Ethereum","ETH",1100,10,"08-11-2022");
			Crypto coin6 = new Crypto("Binance Coin","BNB",190,100,"07-12-2021");
			
			repository.save(coin1);
			repository.save(coin2);
			repository.save(coin3);
			repository.save(coin4);
			repository.save(coin5);
			repository.save(coin6);
			
		};
		
	}
}
