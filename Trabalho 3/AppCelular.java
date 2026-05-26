public class AppCelular implements AssinanteApp{
	
	private String nome;
	
	public AppCelular(String nome){
		this.nome = nome;
	}
	
	public void atualizar(String noticia){
		
		System.out.println("Usuário " + nome + " recebeu no celular: Nova notícia");
		System.out.println(noticia);
		
	}
	
}