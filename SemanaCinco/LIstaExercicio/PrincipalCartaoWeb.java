public class PrincipalCartaoWeb {
    public static void main(String args[]){
        // Inicializando o array de CartaoWeb
        CartaoWeb[] cartaoWeb = new CartaoWeb[3];

        // Adicionando instâncias de cartões no array
        cartaoWeb[0] = new CartaoDiaDosNamorados("Vinicius");
        cartaoWeb[1] = new CartaoNatal("Roberta");
        cartaoWeb[2] = new CartaoAniversario("Joao");

        for (int i = 0; i < cartaoWeb.length; i++){
            cartaoWeb[i].retornarMensagem("Barbara\n\n");
        }
    }
}
