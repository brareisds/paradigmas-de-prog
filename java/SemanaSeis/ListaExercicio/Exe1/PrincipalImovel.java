import java.util.Scanner;

public class PrincipalImovel {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Imovel imoveis[] = new Imovel[3];

        for (int i = 0; i < imoveis.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Digite o valor do imóvel velho:");
                double valor = scanner.nextDouble();
                imoveis[i] = new ImovelVelho("Laranja", 2, "centro", "Curitiba", "Parana", valor);
            } else {
                System.out.println("Digite o valor do imóvel novo:");
                double valor = scanner.nextDouble();
                imoveis[i] = new ImovelNovo("Azul", 50, "xaxim", "Rio de Janeiro", "Rio de Janeiro", valor);
            }
        }

        for (int i = 0; i < imoveis.length; i++) {
            System.out.println("Endereço do imóvel " + (i + 1) + ": ");
            System.out.println(imoveis[i].getEndereco().toString());
            System.out.printf("O valor do imóvel é: %.2f\n", imoveis[i].calcularValorImovel());
        }
        
        // for (Imovel imovel : imoveis) {
        //     System.out.printf("O valor do imóvel é: %.2f\n", imovel.calcularValorImovel());
        // }

        scanner.close();
    }
}