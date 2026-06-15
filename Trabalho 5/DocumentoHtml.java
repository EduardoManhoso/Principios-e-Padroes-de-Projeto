class DocumentoHtml implements Documento{
	
	protected String conteudo;
	
	public void setConteudo(String conteudo){
		
		this.conteudo = conteudo;
		
	}
	
	public void desenha(){
		
		System.out.println("Desenha documento HTML: " + conteudo);
		
	}
	
	public void imprime(){
		
		System.out.println("Imprime documento HTML: " + conteudo);
		
	}
	
}