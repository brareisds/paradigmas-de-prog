import java.util.Scanner;

public class ExercicioSeis{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int[][] m = new int[4][4];
        int valorBusca, encontrado = 0;

        System.out.println("Digite os valores da matriz 4x4: ");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.printf("m[%d][%d]: ", i, j);
                m[i][j] = input.nextInt();
            }
        }

        System.out.println("Digite um valor para ser buscado na matriz: ");
        valorBusca = input.nextInt();

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] == valorBusca){
                    encontrado = 1;
                    System.out.printf("Valor %d encontrado na posicao m[%d][%d]%n", valorBusca, i, j);
                }
            }
        }

        if(encontrado == 0)
            System.out.println("Elemento nao encontrado na matriz");
    }
}