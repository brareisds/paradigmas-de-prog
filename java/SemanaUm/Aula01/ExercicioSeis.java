import java.util.Scanner;

class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite o time de futebol de sua preferencia: ");
        String timeFutebol = scanner.nextLine();

        System.out.print("Digite o bairro onde voce mora: ");
        String bairro = scanner.nextLine();

        System.out.println("\nNome completo: " + nomeCompleto);
        System.out.println("Time de futebol de preferencia: " + timeFutebol);
        System.out.println("Bairro onde mora: " + bairro);

        scanner.close();
    }
}
