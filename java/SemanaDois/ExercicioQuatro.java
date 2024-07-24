public class ExercicioQuatro {
    public static void main(String[] args){
        /*Criei um vetor com duas posicoes nulas */
        PessoaNova pessoas[] = new PessoaNova[2];
       // Data dataDeNasc[] = new Data[2];

        /*Instancia os objetos */
        for(int i=0; i < pessoas.length; i++){
            pessoas[i] = new PessoaNova();
           // dataDeNasc[i] = new Data();
        }

        /*Preenche os objetos */
        pessoas[0].nome = "Grace Hopper";
        pessoas[1].nome = "Ada Lovelace";
        
        pessoas[0].dataDeNasc.ajustarData(9,12, 1906);
        pessoas[1].dataDeNasc.ajustarData(10,12, 1815);
        
        for(int i = 0; i < pessoas.length; i++){
            pessoas[i].calcularIdade(11, 03, 2024);
            System.out.print("A idade de " + pessoas[i].retornarNome() + " seria: " + pessoas[i].retornarIdade() + " e sua data de nascimento eh: ");
            pessoas[i].dataDeNasc.imprimirData();
        }
    }
}
