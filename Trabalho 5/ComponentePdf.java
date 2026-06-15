class ComponentePdf{
	
	private String conteudo;
	
    void pdfFixaConteudo(String conteudo){
		
		this.conteudo = conteudo;
		
	}
	
    void pdfPreparaExibicao(){
		
		System.out.println("Exibição PDF: início");
		
	}
	
    void pdfAtualiza(){
		
		System.out.println("Exibição conteúdo PDF: " + conteudo);
		
	}
	
    void pdfFinalizaExibicao(){
		
		System.out.println("Exibição PDF: fim");
		
	}
	
	void pdfEnviaImpressora(){
		
		System.out.println("Impressão PDF: " + conteudo);
		
	}
	
}
