public class ImovelNovo extends Imovel {

    public ImovelNovo(String rua, int numero, String bairro, String cidade, String estado, double preco){
        super(rua, numero, bairro, cidade, estado, preco);
    }

    public double calcularValorImovel(){
        return this.preco * 1.1;
    }
}