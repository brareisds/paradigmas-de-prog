import java.util.*; 

public class PrincipalAluno {
    public static void main(String[] args) {
    
        TreeSet<AlunoMonitor> monitores = new TreeSet<AlunoMonitor>(3);

        monitores.add(new AlunoMonitor("João", 123, "CI1062")); // paradigmas de prog
        monitores.add(new AlunoMonitor("Barbara", 456, "CI182")); // fundamentos de prog
        monitores.add(new AlunoMonitor("Amanda", 789, "CI182"));

        Iterator<AlunoMonitor> i = monitores.iterator();
        while(i.hasNext()){
            AlunoMonitor a = i.next();
            System.out.println(a.getNome() + " - " + a.getMatricula() + " - " + a.getCodigoDisciplina());
        }

    }
        
}