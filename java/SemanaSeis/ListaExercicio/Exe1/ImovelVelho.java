public class ImovelVelho extends Imovel{

    public ImovelVelho(String rua, int numero, String bairro, String cidade, String estado, double preco){
        super(rua, numero, bairro, cidade, estado, preco);
    }
    

    public double calcularValorImovel(){
        return this.preco * 0.9 + 1000.0;
    }
}
