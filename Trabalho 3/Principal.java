public class Principal{
	
	public static void main(String[] args){
		
		LeFigaroDigital teste = new LeFigaroDigital();
		AssinanteApp[] assinantes = {new AppCelular("Maria"), new AppTablet("João"), new AppWeb("José")};
		
		for(AssinanteApp ass: assinantes)
			teste.inscrever(ass);
		
		//publicando noticia
		System.out.println();
		teste.novaNoticia("Fim da escala 6x1.");
		
		//removendo assinate
		teste.cancelar(assinantes[1]);
		
		//publicando nova noticia
		System.out.println();
		teste.novaNoticia("Moradores de São Paulo sentem tremor após terremoto no Chile.");
		
		
	}
	
}