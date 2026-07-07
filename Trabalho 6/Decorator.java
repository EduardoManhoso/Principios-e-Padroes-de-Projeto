abstract class Decorator implements ComponenteGraficoVeiculo{
	
	protected ComponenteGraficoVeiculo componente;
	
	public Decorator(ComponenteGraficoVeiculo componente){
		this.componente = componente;
	}
	
	public void exibir(){
		componente.exibir();
	}
	
}