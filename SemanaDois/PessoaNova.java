
public class PessoaNova {
    
    String nome;
    int idade;
    Data dataDeNasc = new Data();

    public String retornarNome(){
        return nome;
    }

    public int retornarIdade(){
        return idade;
    }

    public void calcularIdade(int diaAtual, int mesAtual, int anoAtual){
        /* nao ha ambiguidade entre a variavel local idade e o atributo idade da classe. */
        idade = anoAtual - dataDeNasc.ano;
        
        if(mesAtual < dataDeNasc.mes || (mesAtual == dataDeNasc.mes && diaAtual < dataDeNasc.dia))
            idade --;
    }
    
}
