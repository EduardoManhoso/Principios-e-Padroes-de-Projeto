class PedidoCredito extends Pedido{
	
	public PedidoCredito(double valor){
		
		this.valor = valor;
		
	}
	
	boolean valido(){
		return valor >= 1000 && valor <= 5000;
	}
	
	void pagar(){
		
		System.out.println("Pagamento do pedido por credito de valor " + valor + " realizado.");
		
	}
	
}