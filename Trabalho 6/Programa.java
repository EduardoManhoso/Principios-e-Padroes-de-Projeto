class Programa{
	
	public static void main(String[] args){
		
		ComponenteGraficoVeiculo v = new VisaoVeiculo();
		v = new DecoradorModelo(v);
		v = new DecoradorMarca(v);
		v.exibir();
		
	}
	
}