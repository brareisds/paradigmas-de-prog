public class ModalidadeFitness implements ModalidadeEsportiva{
    protected TempoDuracao duracao;
    protected int intensidade;

    public ModalidadeFitness(){};
    public ModalidadeFitness(int intensidade, int horaDuracao, int minutoDuracao){
        this.setIntensidade(intensidade);
        this.duracao = new TempoDuracao(horaDuracao,minutoDuracao);
    };

    public void setIntensidade(int intensidade){
        if(intensidade > 0)
            this.intensidade = intensidade;
    }
    public int getIntensidade(){
        return this.intensidade;
    }
    public TempoDuracao getDuracao(){
        return this.duracao;
    }
    public void imprimeRegras(){
        System.out.println("Uma regra da modalidade Fitness eh o principio da progressao");
    }
    public void imprimeObjetivos(){
        System.out.println("O objetivo da modalidade Fitness eh a melhora do condicionamento fisico do individuo");
    }
    public void aumentaIntensidade(){
        int novaIntensidade = this.intensidade + 1;
        this.setIntensidade(novaIntensidade);
    }

}
