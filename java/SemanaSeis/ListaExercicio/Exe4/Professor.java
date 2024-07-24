public class Professor {
    private String nome;
    private int matricula;

    public Professor(String nome, int matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    public void setNome(String nome){
        if ( nome != null)
            this.nome = nome;
    }

    public void setMatricula(int matricula){
        if ( matricula > 0)
            this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }
}