class PedidoCafe implements Command{
	
	Cozinheiro cozinheiro;
	
	public PedidoCafe(Cozinheiro cozinheiro){
		
		this.cozinheiro = cozinheiro;
		
	}
	
	public void execute(){
		
		cozinheiro.prepararCafe();
		
	}
	
	public void undo(){
		
		cozinheiro.cancelarCafe();
		
	}
	
}