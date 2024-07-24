public class Desafio {
    public static void main(String[] args){
        /*Criei um vetor com duas posicoes nulas */
        Pessoa pessoas[] = new Pessoa[2];
       // Data dataDeNasc[] = new Data[2];

        /*Instancia os objetos */
        for(int i=0; i < pessoas.length; i++){
            pessoas[i] = new Pessoa();
           // dataDeNasc[i] = new Data();
        }

        /*Preenche os objetos */
        pessoas[0].setNome("Grace Hopper");
        pessoas[1].setNome("Ada Lovelace");
        
        pessoas[0].getDataNasc().ajustarData(9,12, 1906);
        pessoas[1].getDataNasc().ajustarData(10,12, 1815);
        
        for(int i = 0; i < pessoas.length; i++){
            pessoas[i].calcularIdade(11, 03, 2024);
            System.out.print("A idade de " + pessoas[i].getNome() + " seria: " + pessoas[i].getIdade() + " e sua data de nascimento eh: " + pessoas[i].toString());
        
        }
    }
}
