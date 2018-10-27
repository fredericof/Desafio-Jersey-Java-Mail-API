package com.javaee.service;

import com.javaee.domain.Pedido;
import com.javaee.email.EmailConfig;

public class PedidoServiceImpl implements IPedido {

	public String enviarEmailCliente(Pedido pedido) {
		enviarEmail(pedido);
		return "Pedido realizado com sucesso!";
	}
	
	public void enviarEmail(Pedido pedido) {
    	final String fromEmail = "fredericofbh@gmail.com";
		final String password = "******";
		final String toEmail = pedido.getEmailCliente();
		
		System.out.println("Inicializando envio...");
		
		EmailConfig config = new EmailConfig();
		
		config.enviarEmail(fromEmail, password, toEmail, "Compra realizada com sucesso!",
				"Obrigado pela compra " + pedido.getNomeCliente() + "." + " O produto " + pedido.getProduto().getNome() +
				" com o identificador de Nº " + pedido.getProduto().getId() + " será enviado no próximo dia útil.");
    }

}
