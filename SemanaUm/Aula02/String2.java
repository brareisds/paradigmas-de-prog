import java.util.Scanner;

public class String2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome completo: ");
        String nome = scanner.nextLine();

        String[] vetNome = nome.split("\\s+");
        System.out.println(vetNome[vetNome.length-1] + ", " + String.valueOf(vetNome[0].charAt(0)) + ".");

        scanner.close();
    }
}
