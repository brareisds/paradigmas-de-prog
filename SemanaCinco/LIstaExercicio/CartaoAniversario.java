public class CartaoAniversario extends CartaoWeb {
    
    public CartaoAniversario (String destinatario){
        super(destinatario);
    }

    public void retornarMensagem(String remetente) {
        System.out.printf("Querida %s,\nFeliz Aniversario!\nCom amor,\n%s", this.destinatario, remetente);
    }

}