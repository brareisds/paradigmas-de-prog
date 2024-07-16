public abstract class CartaoWeb {

    protected String destinatario;
    protected String nomeDestinatario;

    public CartaoWeb(String destinatario){
        this.setDestinatario(destinatario);
    }

    public abstract void retornarMensagem(String remetente);

    public void setDestinatario(String destinatario){
        if (destinatario != null){
            this.destinatario = destinatario;
        }
    }

    public String getDestinatario(){
        return this.destinatario;
    }
}