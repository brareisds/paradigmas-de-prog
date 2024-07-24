import java.util.Scanner;

class String1 {
    public static void main(String[] args) 
    {
        System.out.println("Digite uma frase: ");
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        String[] palavras = frase.split("\\s+");
        System.out.println("Quantidade de palavras eh: " + palavras.length);
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        scanner.close();
    }
}
