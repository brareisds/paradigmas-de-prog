public class Endereco{

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado){
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public void setRua(String rua){
        if(rua != null && rua.length() > 0){
            this.rua = rua;
        }
    }

    public String getRua(){
        return this.rua;
    }

    public void setNumero(int numero){
        if(numero >= 0){
            this.numero = numero;
        }
    }

    public int getNumero(){
        return this.numero;
    }

    public void setBairro(String bairro){
        if(bairro != null && bairro.length() > 0){
            this.bairro = bairro;
        }
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setCidade(String cidade){
        if(cidade != null && cidade.length() > 0){
            this.cidade = cidade;
        }
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setEstado(String estado){
        if(estado != null && estado.length() > 0){
            this.estado = estado;
        }
    }

    public String getEstado(){
        return this.estado;
    }

    public String toString(){
        return "Rua: " + this.rua + " Numero: " + this.numero + " Bairro: " + this.bairro + " Cidade: " + this.cidade + " Estado: " + this.estado;
    }

}