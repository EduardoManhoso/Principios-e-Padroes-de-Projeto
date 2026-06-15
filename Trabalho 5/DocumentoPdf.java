class DocumentoPdf implements Documento{
	
	protected ComponentePdf ferramentaPdf;
	
	public DocumentoPdf(){
		
		ferramentaPdf =  new ComponentePdf();
		
	}
	
	public void setConteudo(String conteudo){
		
		ferramentaPdf.pdfFixaConteudo(conteudo);
		
	}
	
    public void desenha(){
		
		ferramentaPdf.pdfPreparaExibicao();
		ferramentaPdf.pdfAtualiza();
		ferramentaPdf.pdfFinalizaExibicao();
		
	}
	
    public void imprime(){
		
		ferramentaPdf.pdfEnviaImpressora();
		
	}

}