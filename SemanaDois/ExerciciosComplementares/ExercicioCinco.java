import java.util.Scanner;

public class ExercicioCinco{
    public static void main(String args[]){

        double peso, altura, imc;
        int qntdAcimaPeso = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();

        while(peso != -1 && altura != -1){
            imc = peso / (altura * altura);
            if(imc > 25){
                qntdAcimaPeso++;
            }
            System.out.println("Digite seu peso: ");
            peso = input.nextDouble();
            if(peso == -1)
                break;
            System.out.println("Digite sua altura: ");
            altura = input.nextDouble();
        }

        System.out.println("Quantidade de pessoas acima do peso: " + qntdAcimaPeso);

    }
}