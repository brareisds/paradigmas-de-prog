import java.util.Scanner;

public class ExercicioDois {
    public static void main(String args[]){
        
        int[] vetSoma = {0,0,0}; // declaracao e instanciacao na mesma linha
        //int[][] m = {{4,8,7}, {-1,2,-3}, {5,1,6}}; // a qtd de trio de chaves interno representa o numero de linhas e a quantidade de elementos internos a esses colchetes indicam a quantidade de colunas 
        int [][] m = new int[3][3]; // declaracao e instanciacao em linhas separadas
        
        Scanner input = new Scanner(System.in);

        for(int linha = 0; linha < m.length; linha++){
            for(int coluna = 0; coluna < m[linha].length; coluna++){
               System.out.printf("Digite o valor da posicao m[%d][%d]: %n", linha, coluna);
                m[linha][coluna] = input.nextInt();
            }
        }

        //System.out.println("m.lenght: " + m.length); // numero de linhas da matriz
        //System.out.println("m[0].length: " + m[0].length); // numero de colunas da matriz

        for(int linha = 0; linha < m.length; linha++){
            for(int coluna = 0; coluna < m[linha].length; coluna++){
                System.out.printf("m[%d][%d]: %d%n", linha, coluna, m[linha][coluna]);
                vetSoma[coluna] += m[linha][coluna];
            }
        }

        for(int i = 0; i < vetSoma.length; i++){
            System.out.println("Soma da coluna " + i + ": " + vetSoma[i]);
        }

        input.close(); // Fechando o scanner
    }
}