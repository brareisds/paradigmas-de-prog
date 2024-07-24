public abstract class Imovel {
    protected Endereco endereco;
    protected double preco;

    public Imovel(String rua, int numero, String bairro, String cidade, String estado, double preco){
        this.setEndereco(rua,numero,bairro,cidade,estado);
        this.setPreco(preco);
    }

    public abstract double calcularValorImovel();

    public void setEndereco(String rua, int numero, String bairro, String cidade, String estado){
        // nao precisa validar pq as validacoes estao no endereco
        this.endereco = new Endereco(rua,numero,bairro,cidade,estado);
    
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }
    }

    public double getPreco(){
        return this.preco;
    }
}