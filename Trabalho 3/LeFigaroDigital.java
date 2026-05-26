import java.util.*;

public class LeFigaroDigital implements JornalDigital{
	
	protected List<AssinanteApp> lista_assinantes = new ArrayList<AssinanteApp>();
	protected String noticia_atual;
	
	
	public void inscrever(AssinanteApp assinante){
		
		lista_assinantes.add(assinante);
		
	}
	
	public void cancelar(AssinanteApp assinante){
		
		lista_assinantes.remove(assinante);
		
	}
	
	public void notificar(){
		
		for(AssinanteApp obs: lista_assinantes)
			obs.atualizar(noticia_atual);
		
	}
	
	public void novaNoticia(String noticia){
		
		noticia_atual = noticia;
		notificar();
		
	}
	
}