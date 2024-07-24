import java.util.Scanner;

public class PrincipalTime {
    public static void main(String[] args) {
        
        Time horario1 = new Time();
        Time horario2 = new Time();
        Scanner input = new Scanner(System.in);

        int hora1, minuto1, hora2, minuto2;
        
        System.out.println("Digite a hora");
        hora1 = input.nextInt();
        System.out.println("Digite os minutos");
        minuto1 = input.nextInt();
        System.out.println("\nDigite a hora");
        hora2 = input.nextInt();
        System.out.println("Digite os minutos");
        minuto2 = input.nextInt();

        horario1.setHora(hora1);
        horario1.setMinuto(minuto1);
        //System.out.println(horario1.toString());

        horario2.setHora(hora2);
        horario2.setMinuto(minuto2);
        //System.out.println(horario2.toString());

        if(horario2.anterior(horario1.getHora(), horario1.getMinuto()))
            System.out.println("\nO horario " + horario1.toString() + " eh anterior ao horario " + horario2.toString());
        else if(horario2.posterior(horario1.getHora(), horario1.getMinuto()))
            System.out.println("\nO horario " + horario1.toString() + " eh posterior ao horario " + horario2.toString());
        else if(horario2.equals(horario1.getHora(), horario1.getMinuto()))
            System.out.println("\nO horario " + horario1.toString() + " eh igual ao horario " + horario2.toString());
        
        input.close();


    }
}
