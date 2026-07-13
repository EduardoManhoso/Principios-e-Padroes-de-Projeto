class Principal{
	
	public static void main(String[] args){
		
		Cozinheiro cozinheiro = new Cozinheiro();
		Garcom garcom = new Garcom();
		Command cafe = new PedidoCafe(cozinheiro);
		Command cha = new PedidoCha(cozinheiro);
		
		garcom.setPedido(cafe);
		garcom.levarPedido();
		garcom.cancelarUltimoPedido();
		
		System.out.println();
		
		garcom.setPedido(cha);
		garcom.levarPedido();
		garcom.cancelarUltimoPedido();
		
	}
	
}