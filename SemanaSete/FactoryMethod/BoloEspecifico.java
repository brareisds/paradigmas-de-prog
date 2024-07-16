public abstract class BoloEspecifico implements Bolo {
    
    protected int quantidade;

    public BoloEspecifico(int quantidade){
        this.setQuantidade(quantidade);
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }              
}






