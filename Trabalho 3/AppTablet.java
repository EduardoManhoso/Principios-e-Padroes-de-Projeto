public class AppTablet implements AssinanteApp{
	
	private String nome;
	
	public AppTablet(String nome){
		this.nome = nome;
	}
	
	public void atualizar(String noticia){
		
		System.out.println("Tablet de " + nome + " atualizou: Nova notícia");
		System.out.println(noticia);
		
	}
	
}