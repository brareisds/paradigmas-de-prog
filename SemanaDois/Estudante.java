public class Estudante {
    String nome;
    double notaFinal;

    public void setEstudante(String nome, int notaFinal){
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public void exibeInformacoes(){
        System.out.println("Nota final do aluno " + nome + ": " + notaFinal);
    }
}
