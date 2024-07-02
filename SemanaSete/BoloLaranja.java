public class BoloLaranja extends BoloEspecifico {
    
    public BoloLaranja(int quantidade){
        super(quantidade);
    }

    public void assar(){
        System.out.printf("Assando %d bolo(s) de laranja...\n", this.quantidade);
    }

    public void decorar(){
        System.out.printf("Decorando %d bolo(s) de laranja...\n", this.quantidade);
    }
}