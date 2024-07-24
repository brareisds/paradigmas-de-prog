public class BoloChocolate extends BoloEspecifico {

    public BoloChocolate(int quantidade){
        super(quantidade);
    }

    public void assar(){
    System.out.printf("Assando %d bolo(s) de chocolate...\n", this.quantidade);
    }

    public void decorar(){
        System.out.printf("Decorando %d bolo(s) de chocolate...\n", this.quantidade);
    }
}