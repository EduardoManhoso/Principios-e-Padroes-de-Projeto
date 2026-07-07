class DecoradorModelo extends Decorator{
	
	private void exibirInformacoesTecnicas(){
		System.out.println("Informacoes tecnicas do modelo");
	}
	
	public DecoradorModelo(ComponenteGraficoVeiculo componente){
		super(componente);
	}
	
	public void exibir(){
		super.exibir();
		exibirInformacoesTecnicas();
	}
	
}