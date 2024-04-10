public class Spinning extends ModalidadeFitness {
    private int cargaBike;
    
    public Spinning(int cargaBike, int intensidade, int horaDuracao, int minutoDuracao){
        super(intensidade,horaDuracao,minutoDuracao);
        this.setCargaBike(cargaBike);
    }

    public void setCargaBike(int cargaBike){
        if(cargaBike >= 0){
            this.cargaBike = cargaBike;
        }
    }

    public int getCargaBike(){
        return this.cargaBike;
    }

}
