package ExerciciosComplementares;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){
        int num, somaPares = 0, somaImpares = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Numeros pares: ");
        for(int i = 0; i < 10; i++){
            num = input.nextInt();
            if(num % 2 == 0){
                System.out.println(num);
                somaPares++;
            }
        }      

        System.out.println("Numeros Impares ");
        for(int i = 0; i < 10; i++){
            
        }
    }
}
