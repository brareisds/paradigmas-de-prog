public class LampadaFluorescente extends Lampada{
    private int comprimentoLampada;

    public LampadaFluorescente(boolean estado, int comprimentoLampada){
        this.setEstado(estado);
        this.setComprimentoLampada(comprimentoLampada);

    }

    public void setComprimentoLampada(int comprimentoLampada){
        if(comprimentoLampada > 0)
            this.comprimentoLampada = comprimentoLampada;
    }



}