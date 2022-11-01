package com.romeroproject.entrega.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romeroproject.entrega.model.Cliente;

@RestController
public class clienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cli1 = new Cliente();
		cli1.setId(1L);
		cli1.setNome("Jose");
		cli1.setEmail("@Jose");
		cli1.setTelefone("12334534");
		
		Cliente cli2 = new Cliente();
		cli2.setId(1L);
		cli2.setNome("Joao");
		cli2.setEmail("@Joao");
		cli2.setTelefone("7773332464");
		
		Cliente cli3 = new Cliente();
		cli3.setId(1L);
		cli3.setNome("Maria");
		cli3.setEmail("@Maria");
		cli3.setTelefone("9877987");
		
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		
		
		return clientes;
		
	}

}
