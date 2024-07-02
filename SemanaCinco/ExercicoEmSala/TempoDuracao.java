public class TempoDuracao {
    private int horaDuracao;
    private int minutoDuracao;
    public int DURACAOMAX = 2;

    // Nesse caso nao é possivel fazer construtor separado? pq os tipos sao os mesmos
    // public TempoDuracao(int horaDuracao){
    //     this(horaDuracao,-1);
    // }
    public TempoDuracao(int minutoDuracao){
        this(0,minutoDuracao);
    }
    public TempoDuracao(int horaDuracao, int minutoDuracao){
        this.setHoraDuracao(horaDuracao);
        this.setMinutoDuracao(minutoDuracao);
    }
    public void setHoraDuracao(int horaDuracao){
        // Dependeria do horario maximo de treino que a academia disponibliza
        if(horaDuracao >=1 && horaDuracao <= DURACAOMAX)
            this.horaDuracao = horaDuracao;
    }
    public void setMinutoDuracao(int minutoDuracao){
        if(minutoDuracao >= 0 && minutoDuracao <= 59)
            this.minutoDuracao = minutoDuracao;
    }
    public int getHoraDuracao(){
        return this.horaDuracao;
    }
    public int getMinutoDuracao(){
        return this.minutoDuracao;
    }
}
