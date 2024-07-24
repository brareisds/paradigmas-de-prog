import java.util.*;

public class PrincipalProfessor {
    public static void main(String args[]){

        int matriculaProfessor, encontrado = 0;
        Scanner input = new Scanner(System.in);
        LinkedList<Professor> professores = new LinkedList<Professor>();

        professores.add(new Professor("João", 123));
        professores.add(new Professor("Barbara", 456));
        professores.add(new Professor("Amanda", 789));
        professores.add(new Professor("Roberto", 1011));
        professores.add(new Professor("Andre", 1213));

        System.out.println("Lista de professores: ");
        for (Professor p : professores){
            System.out.println(p.getNome() + " - " + p.getMatricula());
        }

        System.out.println("\nDigite a matricula do professor(a) que deseja remover: ");
        matriculaProfessor = input.nextInt();

        for (Professor p : professores){
            if (p.getMatricula() == matriculaProfessor){
                professores.remove(p);
                System.out.println("Professor(a) " + p.getNome() + " - " + p.getMatricula() + " removido.");
                encontrado = 1;
                break;
            }
        }

        if (encontrado == 0){
            System.out.println("Professor(a) não encontrado(a).");
        } else {
            System.out.println("\nLista de professores atualizada: ");
            for (Professor p : professores){
                System.out.println(p.getNome() + " - " + p.getMatricula());
            }
        }
    }
}