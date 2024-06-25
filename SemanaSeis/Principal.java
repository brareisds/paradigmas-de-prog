public class Principal {
    public static void main(String[] args){
        int qntdPeso = 2, intensidade = 2, horaDuracao = 1, minutoDuracao = 30, cargaBike = 3, nivelProficiencia = 2;
        Spinning modalidadeSpinning = new Spinning(cargaBike, intensidade,horaDuracao,minutoDuracao);
        Musculacao modalidadeMusculacao = new Musculacao(qntdPeso, intensidade,horaDuracao,minutoDuracao);
        ModalidadeDeLuta modalidadeBoxe = new ModalidadeDeLuta("Boxe");
        ModalidadeDeLuta modalidadeMuayThai = new ModalidadeDeLuta("Muay Thai");
        // adicionada por mim
        Natacao modalidadeNatacao = new Natacao(nivelProficiencia);

        modalidadeSpinning.imprimeRegras();
        modalidadeSpinning.imprimeObjetivos();
    }
}
