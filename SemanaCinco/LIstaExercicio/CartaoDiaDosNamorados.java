public class CartaoDiaDosNamorados extends CartaoWeb {
    
    public CartaoDiaDosNamorados (String destinatario){
        super(destinatario);
    }

    public void retornarMensagem(String remetente) {
        System.out.printf("Querido %s,\nFeliz dia dos Namorados!\nEspero que esse tenha sido o único cartão do dia dos namorados que tenha recebido nessa data!\nDe todo meu coração,\n%s", this.destinatario, remetente);
    }

}