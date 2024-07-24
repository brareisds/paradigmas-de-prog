
public class Pessoa {
    
    private String nome;
    private int idade;
    private Data dataNasc;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade > 0)
            this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    /* Como setar o atributo do tipo classe? 

    public void setData(Data dataNasc){
        ??
    }

    OU

    public void setData(int dia, int mes, int ano){
        this.dataNasc = new Data();
        this.dataNasc.setDia(dia);
        this.dataNasc.setMes(mes);
        this.dataNasc.setAno(ano);
    } */

    public Data getDataNasc(){
        return this.dataNasc;
    }

    public void calcularIdade(int diaAtual, int mesAtual, int anoAtual){
        
        this.idade = anoAtual - dataNasc.getAno();
        if(mesAtual < this.dataNasc.getMes() || (mesAtual == this.dataNasc.getMes() && diaAtual < this.dataNasc.getDia()))
            this.idade --;
    }

}
