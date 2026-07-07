class Programa{
	
	public static void main(String[] args){
		
		Cliente cliente;
		
		cliente = new ClienteAVista();
		cliente.novoPedido(2000.0);
		cliente.novoPedido(10000.0);
		
		cliente = new ClienteCredito();
		cliente.novoPedido(2000.0);
		cliente.novoPedido(10000.0);
		
	}
	
}