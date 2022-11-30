package com.example.CryptoPortfolio.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.CryptoPortfolio.model.Crypto;
import com.example.CryptoPortfolio.model.CryptoRepository;
import com.example.CryptoPortfolio.model.Wallet;

@Controller
public class CryptoController {

	@Autowired
	private CryptoRepository repository;
	
	
	// Showing all transactions
	@GetMapping(value = {"/transactions","/"})
	public String cryptoPort(Model model) {
		model.addAttribute("cryptos", repository.findAll());
		return "transactions";
	}
	
	// Adding transactions
	@GetMapping("/add")
	public String addCrypto(Model model) {
		model.addAttribute("crypto", new Crypto());
		return "add";
	}
	
	// Save new transaction
	@PostMapping("/add")
	public String save(Crypto crypto) {
		repository.save(crypto);
		return "redirect:portfolio";
	}
	
	// REST for wallet
	@GetMapping("/walletrest")
	public @ResponseBody List<Wallet> cryptoWallet() {
		return (List<Wallet>) repository.findWallet();
	}
	
	// Showing your wallet with current currency and its quantity
	@GetMapping("/wallet")
	public String cryptoWallet(Model model) {
		model.addAttribute("wallets", repository.findWallet());
		return "wallet";
	}
}
