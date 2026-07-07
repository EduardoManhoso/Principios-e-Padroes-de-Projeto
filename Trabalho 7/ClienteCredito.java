class ClienteCredito extends Cliente{
	
	Pedido criarPedido(double valor){
		
		return new PedidoCredito(valor);
		
	}
	
}