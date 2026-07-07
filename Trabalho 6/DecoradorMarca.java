class DecoradorMarca extends Decorator{
	
	private void exibirLogoMarca(){
		System.out.println("Logo da marca");
	}
	
	public DecoradorMarca(ComponenteGraficoVeiculo componente){
		super(componente);
	}
	
	public void exibir(){
		super.exibir();
		exibirLogoMarca();
	}
	
}