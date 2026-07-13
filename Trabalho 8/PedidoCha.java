class PedidoCha implements Command{
	
	Cozinheiro cozinheiro;
	
	public PedidoCha(Cozinheiro cozinheiro){
		
		this.cozinheiro = cozinheiro;
		
	}
	
	public void execute(){
		
		cozinheiro.prepararCha();
		
	}
	
	public void undo(){
		
		cozinheiro.cancelarCha();
		
	}
	
}