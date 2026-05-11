public class Principal {
    public static void main(String[] args){

        //criando os robos
        Robo[] robos = {new RoboExplorador(), new RoboSeguranca(), new RoboEntrega(), new RoboMedico()};

        //percorrendo cada robo
        for(Robo robo: robos){

            System.out.println(robo.getClass().getName());
            robo.mover();
            robo.comunicar();
            robo.executarAcao();
            System.out.println("==========================================================================");

        }

        //robo segurança agora vai voar
        System.out.println("\n");
        System.out.println(robos[1].getClass().getName());
        robos[1].mover();
        robos[1].setLocomocao(new Voar());
        System.out.println();
        robos[1].mover();

    }
    
}
