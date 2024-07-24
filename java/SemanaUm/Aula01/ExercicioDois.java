import java.util.Scanner;

class ExercicioDois {
	public static void main(String[] args)
	{
		int num;

		System.out.println("Digite o numero: ");
		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		/*  Outra forma: String parOuImpar = (num % 2 == 0) ? "par" : "ímpar"; 
		- ? "par" : "ímpar": O operador ternário ? : funciona da seguinte forma: se a condição antes do ? for verdadeira,
		o valor após o ? é retornado; caso contrário, o valor após : é retornado. Neste caso, se num % 2 == 0 for verdadeiro,
		a string "par" é retornada; caso contrário, a string "ímpar" é retornada.*/
        if(num % 2 == 0)
		    System.out.println("O numero digitado eh par.");
        else 
            System.out.println("O numero digitado eh impar.");
        
		s.close();
	}
}
