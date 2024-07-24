public class PrincipalContador{

    public static void main(String[] args){
        Contador contador = new Contador();
        contador.setContador(0);
        System.out.printf("O contador eh: %d", contador.getContador());
        contador.incrementaContador();
        System.out.printf("\nO contador depois de incrementar eh: %d", contador.getContador());
        contador.decrementaContador();
        System.out.printf("\nO contador depois de decrementar eh: %d", contador.getContador());
        contador.decrementaContador();
        System.out.printf("\nO contador depois de decrementar novamente eh: %d", contador.getContador());
        contador.decrementaContador();
        System.out.printf("\nO contador depois de decrementar novamente eh: %d", contador.getContador());
       
        
    }
}