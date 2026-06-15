class ServidorWeb{
	
	public static void main(String[] args){
	
		Documento doc1 = new DocumentoHtml();
		doc1.setConteudo("Hello");
		doc1.desenha();
		doc1.imprime();
		
		System.out.println("\n=================================\n");
		
		Documento doc2 = new DocumentoPdf();
		doc2.setConteudo("Bonjour");
		doc2.desenha();
		doc2.imprime();
		
	}
	
}