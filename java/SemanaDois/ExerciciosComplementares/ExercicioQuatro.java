import java.util.Scanner;

public class ExercicioQuatro{
    public static void main(String args[]){

        double maior, menor;
        double[] v = new double[7];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 7 valores: ");
        for(int i = 0; i < v.length; i++){
            System.out.print("v[" + i + "]: ");
            v[i] = input.nextDouble();
            //System.out.println();
        }

        maior = v[0];
        menor = v[0];
        for(int i = 0; i < v.length; i++){
            if (v[i] > maior)
                maior = v[i];
            if (v[i] < menor)    
                menor = v[i];
            //System.out.printf("v[%d]: %.2f%n", i, v[i]);
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}