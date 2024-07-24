import java.util.Scanner;

class ExercicioTres {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        /* Cria o objeto fora do loop */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero (-1 para sair): ");
        num = scanner.nextInt();

        while (num != -1) {
            sum += num;
            System.out.println("A soma ate agora eh: " + sum);
            System.out.println("Digite outro numero (-1 para sair): ");
            num = scanner.nextInt();
        }

        System.out.println("A soma total eh: " + sum);

        scanner.close();
    }
}
