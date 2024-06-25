import java.util.Scanner;

public class ExercicioTres{
    public static void main(String args[]){

        String palavra, letra, palavraNova;
        int tam, qntdVogais = 0;

        System.out.println("Digite uma palavra: ");
        Scanner input = new Scanner(System.in);

        palavra = input.nextLine();
        tam = palavra.length();

        for(int i = 0; i < tam; i++){
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u')
                qntdVogais++;
           
        }

        System.out.printf("Quantidade de vogais na palavra %s: %d%n", palavra, qntdVogais);
        
        System.out.println("Digite uma consoante: ");
        letra = input.nextLine();

        palavraNova = palavra.replace('a',letra.charAt(0));

        System.out.println("Palavra com a substituicao: " + palavraNova);
        
    }
}