package com.javaee.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.javaee.domain.Pedido;
import com.javaee.domain.Produto;
import com.javaee.service.PedidoServiceImpl;
import com.javaee.service.ProdutoServiceImpl;

@Path("/pedidos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PedidoController {
	
	private ProdutoServiceImpl produtoService;
	private PedidoServiceImpl pedidoService;
	
	public PedidoController() {
		produtoService = new ProdutoServiceImpl();
		pedidoService = new PedidoServiceImpl();
	}
	
	@GET
	public List<Produto> listarProdutos() {
		List<Produto> produtos = produtoService.listarProdutos();
		return produtos;
	}
	
	@POST
    public Response enviarPedido(Pedido pedido) {
		Produto produto = produtoService.getProdutos().get(pedido.getProduto().getId().intValue());
		pedido.setProduto(produto);
        String resposta = pedidoService.enviarEmailCliente(pedido);
		
		return Response.status(Status.OK).entity(resposta).build();
    }

}
