import java.util.Scanner;

class ExercicioQuatro {
    public static void main(String[] args) {
        int multiplo, qntd;

        Scanner s = new Scanner(System.in);

        System.out.println("Multiplo de qual numero?: ");
        multiplo = s.nextInt();

        System.out.println("Quer exibir quantos multiplos de " + multiplo + "?");
        qntd = s.nextInt();

        System.out.println("Os " + qntd + " multiplos de " + multiplo + " são: ");
        for (int i = 0; i < qntd; i++) {
            System.out.println(multiplo * i);
        }
    }
}
