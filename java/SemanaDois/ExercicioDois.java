public class ExercicioDois{
    public static void main(String[] args)
    {
        /*Criei um vetor com duas posicoes nulas */
        Pessoa pessoas[] = new Pessoa[2];

        /*Instancia os objetos */
        pessoas[0] = new Pessoa();
        pessoas[1] = new Pessoa();

        /*Preenche os objetos */
        pessoas[0].nome = "Grace Hopper";
        pessoas[1].nome = "Ada Lovelace";
        
        pessoas[0].ajustarDataDeNascimento(9,12, 1906);
        pessoas[1].ajustarDataDeNascimento(10,12, 1815);
        
        for(int i = 0; i<pessoas.length; i++){
            pessoas[i].calcularIdade(11, 03, 2024);
            System.out.println("A idade de " + pessoas[i].retornarNome() + " seria: " + pessoas[i].retornarIdade());
        }
    }
}