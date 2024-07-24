public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia){
        int[] qntdDias =  {31,28,31,30,31,30,31,31,30,31,30,31};

        if(dia > 0 && dia <= qntdDias[this.mes - 1])
            this.dia = dia; 
    }   

    public int getDia(){
        return this.dia;
    }

    public void setMes(int mes){
        if(mes > 0 && mes <= 12)
            this.mes = mes;
    }

    public int getMes(){
        return this.mes;
    }

    public void setAno(int ano){
        if(ano >= 0)
            this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public void ajustarData(int dia, int mes, int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public boolean anterior(int dia, int mes, int ano){
        if(ano < this.getAno() || (ano == this.getAno() && mes < this.getMes()) || (ano == this.getAno() && mes == this.getMes() && dia < getDia()))
            return true;
        else
            return false;
    }

    public boolean posterior(int dia, int mes, int ano){
        if(ano > this.getAno() || (ano == this.getAno() && mes > this.getMes()) || (ano == this.getAno() && mes == this.getMes() && dia > getDia()))
            return true;
        else
            return false;
    }

    public boolean equals(int dia, int mes, int ano){
        if(ano == this.getAno() && mes == this.getMes() && dia == getDia())
            return true;
        else
            return false;
    }

    // public String toString(){
    //     if(dia < 10 && mes < 10)
    //         return String.format("0%d/0%d/%d", this.dia, this.mes, this.ano);
    //     else if(dia < 10 && mes > 9)
    //         return String.format("0%d/%d/%d", this.dia, this.mes, this.ano);
    //     else if(dia > 9 && mes < 10)
    //         return String.format("%d/0%d/%d", this.dia, this.mes, this.ano);
    //     else
    //         return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    // }

    public String toString() {
        return String.format("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }

    
}
