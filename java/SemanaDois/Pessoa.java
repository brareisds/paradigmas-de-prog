public class Pessoa {

    String nome;
    int idade;
    DataDeNascimento dataDeNascimento = new DataDeNascimento();

    public class DataDeNascimento {
        int dia;
        int mes;
        int ano;
    }

    public void ajustarDataDeNascimento(int dia, int mes, int ano){
        dataDeNascimento.dia = dia;
        dataDeNascimento.mes = mes;
        dataDeNascimento.ano = ano;
    }

    public String retornarNome(){
        return nome;
    }

    public int retornarIdade(){
        return idade;
    }

    public void calcularIdade(int diaAtual, int mesAtual, int anoAtual){
        /* nao ha ambiguidade entre a variavel local idade e o atributo idade da classe. */
        idade = anoAtual - dataDeNascimento.ano;
        
        if(mesAtual < dataDeNascimento.mes || (mesAtual == dataDeNascimento.mes && diaAtual < dataDeNascimento.dia))
            idade --;
    }

}
