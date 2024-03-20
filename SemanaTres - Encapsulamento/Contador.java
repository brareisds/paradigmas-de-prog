public class Contador {

    private int contador;

    public void setContador(int contador){
        
        if (contador >= 0){
            this.contador = contador;
        }
    }

    public int getContador(){
        return this.contador;
    }

    public void zeraContador(){
        this.contador = 0;
    }

    public void incrementaContador(){
        this.contador++;
    }

    public void decrementaContador(){
        int contadorDecrementado = this.contador - 1;
       // System.out.println("contadorDecrementado" + contadorDecrementado);
        setContador(contadorDecrementado);
    }
}
