import java.util.Scanner;


class ExercicioCinco {
	
	public static void main(String[] args)
	{
		int num;

		System.out.println("Digite o numero: ");
		Scanner s = new Scanner(System.in);

		if (!s.hasNextInt())
            System.out.println("Entrada invalida. Digite um numero inteiro.");
		else{
			num = s.nextInt();

			if(num >= 0 && num < 5){
				System.out.println(num);
			} else if(num >= 5 && num < 10){
				System.out.println(2*num + 1);
			} else if(num >=10){
				System.out.println(num - 3);
			}
		}
        
	}
}


