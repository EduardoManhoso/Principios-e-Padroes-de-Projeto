public class TesteRobos{
	
	public static void main(String[] args){
		
		Robo[] robo = {new RoboExplorador(), new RoboSeguranca(), new RoboEntrega(), new RoboMedico(), new RoboEntregaSemRetorno()};
		
		for(Robo r: robo){
			
			System.out.println("=============================================");
			System.out.println(r.getClass().getName() + "\n");
			r.executarMissao();
			
		}
		
		
	}
	
}