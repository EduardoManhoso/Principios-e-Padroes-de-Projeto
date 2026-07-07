class ClienteAVista extends Cliente{
	
	Pedido criarPedido(double valor){
		
		return new PedidoAVista(valor);
		
	}
	
}
