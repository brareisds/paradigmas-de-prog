class public Lampada{
    protected boolean estado;

    public Lampada(){};
    public Lampada(boolean estado){
        this.setEstado(estado);
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public boolean getEstado(){
        return this.estado;
    }

}