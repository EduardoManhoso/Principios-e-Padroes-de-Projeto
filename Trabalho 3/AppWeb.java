public class AppWeb implements AssinanteApp{
	
	private String nome;
	
	public AppWeb(String nome){
		this.nome = nome;
	}
	
	public void atualizar(String noticia){
		
		System.out.println(nome + "! Web atualizou: Nova notícia");
		System.out.println(noticia);
		
	}
	
}