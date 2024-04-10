public class Musculacao extends ModalidadeFitness {
    private int qntdPeso;

    public Musculacao(int qntdPeso, int intensidade, int horaDuracao, int minutoDuracao){
        super(intensidade,horaDuracao,minutoDuracao);
        this.setqntdPeso(qntdPeso);
    }
    public void setqntdPeso(int qntdPeso){
        if(qntdPeso >= 0){
            this.qntdPeso = qntdPeso;
        }
    }

    public int getqntdPeso(){
        return this.qntdPeso;
    }
}
