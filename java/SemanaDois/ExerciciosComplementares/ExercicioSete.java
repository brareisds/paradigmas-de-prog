import java.util.Scanner;

public class ExercicioSete{
    public static void main(String args[]){

       Scanner input = new Scanner(System.in);
       String frase1, frase2, frase1Lower, frase2Lower, frase1Nova, frase2Nova;
       int tam1, tam2;
       

       System.out.println("Digite a frase 1: ");
        frase1 = input.nextLine();
        frase1Lower = frase1.toLowerCase();
        System.out.println("Digite a frase 2: ");
        frase2 = input.nextLine();
        frase2Lower = frase2.toLowerCase();

        frase1Nova = frase1Lower.replace('a','*');
        frase2Nova = frase2Lower.replace('a','*');

        tam1 = frase1Nova.length();
        tam2 = frase2Nova.length();


        System.out.println("Frase 1: ");
        for(int i = tam1 - 1; i >= 0; i--){
            System.out.print(frase1Nova.charAt(i));
        }
        System.out.println();

        System.out.println("Frase 2: ");
        for(int i = tam2 - 1; i >= 0; i--){
            System.out.print(frase2Nova.charAt(i));
        }
        System.out.println();
    }
}