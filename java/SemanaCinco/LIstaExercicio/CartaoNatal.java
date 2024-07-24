public class CartaoNatal extends CartaoWeb {
    
    public CartaoNatal (String destinatario){
        super(destinatario);
    }

    public void retornarMensagem(String remetente) {
        System.out.printf("Querida %s,\nFeliz Natal!\nCom amor,\n%s", this.destinatario, remetente);
    }

}