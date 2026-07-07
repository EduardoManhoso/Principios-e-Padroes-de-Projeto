class PedidoAVista extends Pedido{
	
	public PedidoAVista(double valor){
		
		this.valor = valor;
		
	}
	
	boolean valido(){
		return true;
	}
	
	void pagar(){
		
		System.out.println("Pagamento do pedido a vista de valor " + valor + " realizado.");
		
	}
	
}
