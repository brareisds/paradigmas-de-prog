import java.util.Scanner;

public class PrincipalData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Data data[] = new Data[3];

        int dia, mes, ano;
        for(int i = 0; i < data.length; i++){
            data[i] = new Data();
            System.out.println("\nData " + (i+1) + ":");

            System.out.println("Digite o dia: ");
            dia = input.nextInt();
            System.out.println("Digite o mes: ");
            mes = input.nextInt();
            System.out.println("Digite o ano (yyyy): ");
            ano = input.nextInt();

            data[i].setDia(dia);
            data[i].setMes(mes);
            data[i].setAno(ano);
        }

        Data menorData = data[0];
        Data maiorData = data[0];

        for (int i = 1; i < data.length; i++) {
            /* Verifica se a data[i] eh menor que a menorData */
            if (menorData.anterior(data[i].getDia(), data[i].getMes(), data[i].getAno())) {
                menorData = data[i];
            }
            /* Verifica se a data[i] eh maior que a maiorData */
            if (maiorData.posterior(data[i].getDia(), data[i].getMes(), data[i].getAno())) {
                maiorData = data[i];
            }
        }

        if (maiorData.equals(menorData.getDia(), menorData.getMes(), menorData.getAno())) {
            System.out.println("\nAs datas sao iguais");
        } else {
            System.out.println("\nA maior data entre as tres eh " + maiorData.toString() + " e a menor eh " + menorData.toString());
        }

        input.close();

    }
}
