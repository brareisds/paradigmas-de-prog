import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Estudante alunos[] = new Estudante[5];

        for(int i = 0; i < alunos.length; i++)
            alunos[i] = new Estudante();

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno: ");
            alunos[i].nome = scanner.nextLine();
            System.out.println("Digite a nota final do aluno: ");
            alunos[i].notaFinal = scanner.nextInt();
            /*Consome o /n do enter */
            scanner.nextLine();
        }

        int soma = 0, media, qntdExameFinal = 0, reprovados = 0;
        System.out.println("Aprovados:");
        for(int i = 0; i < alunos.length; i++){
            soma += alunos[i].notaFinal;
            if(alunos[i].notaFinal < 40)
                reprovados++;
            else if(alunos[i].notaFinal <= 69)
                qntdExameFinal++;
            else{
                alunos[i].exibeInformacoes();
            }
        }

        media = soma / alunos.length;

        System.out.println("A media da turma foi: " + media);
        System.out.println("Quantidade de estudantes que foram para o exame final: " + qntdExameFinal);
        System.out.println("Quantidade de estudantes que foram reprovados: " + reprovados);

        scanner.close();

    }
}
