import java.util.Scanner;

public class Principal_SegundoPrograma{
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int num;
        String teste;
        System.out.println("Digite um numero: ");
        
        //num = input.nextInt();
        teste = input.next();
        
        System.out.println("A String digitada foi: " + teste);
    }
}
