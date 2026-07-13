class Garcom{
	
	public Command pedido;
	public Command ultimoPedido;
	
	public void setPedido(Command pedido){
		
		this.pedido = pedido;
		
	}
	
	public void levarPedido(){
		
		pedido.execute();
		
		ultimoPedido = pedido;
		
	}
	
	public void cancelarUltimoPedido(){
		
		if(ultimoPedido != null)
			ultimoPedido.undo();
		
	}
	
}