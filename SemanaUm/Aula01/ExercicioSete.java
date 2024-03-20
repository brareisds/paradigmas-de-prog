import java.util.Scanner;
import java.util.Random;

class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        System.out.println("Digite a quantidade de notas para cada aluno: ");
        int quantidadeNotas = scanner.nextInt();

        int[][] notas = new int[quantidadeAlunos][quantidadeNotas];

        preencherNotasAleatorias(notas, gerador);

        imprimirMaioresNotas(notas);
    }

    private static void preencherNotasAleatorias(int[][] notas, Random gerador) {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = gerador.nextInt(11);
            }
        }
    }

    private static void imprimirMaioresNotas(int[][] notas) {
        int maiorNotaTurma = 0;
        for (int i = 0; i < notas.length; i++) {
            int maiorNotaAluno = 0;
            for(int j = 0; j < notas[i].length; j++){
                if(notas[i][j] > maiorNotaAluno)
                    maiorNotaAluno = notas[i][j];
            }
            System.out.println("Maior nota do aluno " + (i + 1) + ": " + maiorNotaAluno);
            if (maiorNotaAluno > maiorNotaTurma) {
                maiorNotaTurma = maiorNotaAluno;
            }
        }
        System.out.println("Maior nota da turma: " + maiorNotaTurma);
    }
}
