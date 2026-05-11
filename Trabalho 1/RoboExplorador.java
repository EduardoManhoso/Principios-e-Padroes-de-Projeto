public class RoboExplorador extends Robo{
    

    public RoboExplorador(){

        this.locomocao = new MoverComEsteiras();
        this.comunicacao = new ComunicarPorRadio();
        this.acao = new ExplorarAmbiente();

    }

}
