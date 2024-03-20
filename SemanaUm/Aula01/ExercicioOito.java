import java.util.Scanner;

class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasAcimaDoPeso = 0;
        double peso, altura;

        System.out.println("Digite o peso (kg) e a altura (m) das pessoas. Digite -1 para sair.");

        while (true) {
            System.out.print("Peso: ");
            peso = scanner.nextDouble();

            // Verifica se o usuário deseja sair
            if (peso == -1) {
                break;
            }

            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            // Verifica se o usuário deseja sair
            if (altura == -1) {
                break;
            }

            // Calcula o IMC (indice de Massa Corporal)
            double imc = peso / (altura * altura);

            // Verifica se a pessoa está acima do peso (IMC > 25)
            if (imc > 25) {
                pessoasAcimaDoPeso++;
            }
        }

        System.out.println("Total de pessoas acima do peso: " + pessoasAcimaDoPeso);

        scanner.close();
    }
}
