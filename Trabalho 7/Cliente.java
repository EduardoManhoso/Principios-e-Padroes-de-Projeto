import java.util.*;

abstract class Cliente{
	
	private List<Pedido> lista_pedidos = new ArrayList<>();
	
	void novoPedido(double valor){
		
		Pedido pedido = criarPedido(valor);
		if(pedido.valido()){
			
			pedido.pagar();
			lista_pedidos.add(pedido);
			
		}
		else{
			
			System.out.println("O pedido por credito no valor de " + valor + " eh recusado, pois nao passa na validacao.");
			
		}
		
	}
	
	abstract Pedido criarPedido(double valor);
	
}