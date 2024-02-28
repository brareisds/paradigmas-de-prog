import java.util.Scanner;

class ExercicioUm {
	public static void main(String[] args)
	{
		int num;
		System.out.println("Digite um numero: ");

		Scanner s = new Scanner(System.in);
		if (!s.hasNextInt())
            System.out.println("Entrada invalida. Digite um numero inteiro.");
		else{
			num = s.nextInt();

			if(num > 0){
				System.out.println("O numero eh positivo");
			} else {
				System.out.println("O numero nao eh postivo");
			}
		}
		s.close();
	}
	
}
