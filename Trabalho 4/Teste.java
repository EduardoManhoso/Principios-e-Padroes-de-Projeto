class Teste{
	
	public static void main(String[] args){
		
		Vendedor teste = Vendedor.getInstance();
		
		teste.setNome("Vendedor Auto");
		teste.setEndereco("Uberlândia");
		teste.setEmail("vendedor@auto.com");
		
		Vendedor teste1 = Vendedor.getInstance();
		
		teste1.exibir();
		
		System.out.println(teste == teste1);
		
	}
	
}