public class AlunoMonitor implements Comparable<AlunoMonitor> {
    protected String nome;
    protected int matricula;
    protected String codigoDisciplina;

    public AlunoMonitor(String nome, int matricula, String codigoDisciplina){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setCodigoDisciplina(codigoDisciplina);
    }

    public void setNome(String nome){
        if ( nome != null)
            this.nome = nome;
    }

    public void setMatricula(int matricula){
        if ( matricula > 0)
            this.matricula = matricula;
    }

    public void setCodigoDisciplina(String codigoDisciplina){
        if ( codigoDisciplina != null)
            this.codigoDisciplina = codigoDisciplina;
    }

    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public String getCodigoDisciplina(){
        return this.codigoDisciplina;
    }

    @Override
    public int compareTo(AlunoMonitor a){
        return this.nome.compareTo(a.getNome());
    }


}