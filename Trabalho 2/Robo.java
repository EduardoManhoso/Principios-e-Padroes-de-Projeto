abstract class Robo {
    
    final void executarMissao(){
		
		iniciarSistema();
		deslocar();
		executarAcaoPrincipal();
		comunicarResultado();
		
		if(deveRetornarBase())
			retornarBase();
		
	}

	void iniciarSistema(){
		
		System.out.println("Iniciando sistema.");
		
	}
	
	abstract void deslocar();
	
	abstract void executarAcaoPrincipal();
	
	void comunicarResultado(){
		
		System.out.println("Comunicando resultado.");
		
	}
	
	void retornarBase(){
		
		System.out.println("Retornando a base.");
		
	}
	
	boolean deveRetornarBase(){
		
		return true;
		
	}
}
