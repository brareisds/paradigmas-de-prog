public class Time {

    private int hora;
    private int minuto;

    public void setHora(int hora){
        if(hora >= 0 && hora <=23)
            this.hora = hora;
    }

    public int getHora(){
        return this.hora;
    }

    public void setMinuto(int minuto){
        if(minuto >= 0 && minuto <= 59)
            this.minuto = minuto;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public boolean anterior(int hora, int minuto){
        if(hora < this.getHora() || (hora == this.getHora() && minuto < this.getMinuto())){
            return true;
        } else
            return false;
    }

    public boolean posterior(int hora, int minuto){
        if(hora > this.getHora() || (hora == this.getHora() && minuto > this.getMinuto())){
            return true;
        } else
            return false;
    }

    public boolean equals(int hora, int minuto){
        if(hora == this.getHora() && minuto == this.getMinuto())
            return true;
        else
            return false;
    }

    public String toString(){
        if(this.getMinuto() < 10)
            return String.format("%d:0%d", this.getHora(),this.getMinuto());
        else
            return String.format("%d:%d", this.getHora(),this.getMinuto());

    }

}
