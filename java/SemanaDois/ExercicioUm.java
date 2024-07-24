public class ExercicioUm{
    public static void main(String[] args)
    {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Grace Hopper";
        pessoa1.ajustarDataDeNascimento(9,12, 1906);
        
        pessoa2.nome = "Ada Lovelace";
        pessoa2.ajustarDataDeNascimento(10, 12, 1815); 

        pessoa1.calcularIdade(11, 03, 2024);
        pessoa2.calcularIdade(11, 03, 2024);

        System.out.println("A idade de " + pessoa1.retornarNome() + " seria: " + pessoa1.retornarIdade());
        System.out.println("A idade de " + pessoa2.retornarNome() + " seria: " + pessoa2.retornarIdade());

    }
}