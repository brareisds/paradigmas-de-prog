public class Natacao {
    private int nivelProficiencia;

    public Natacao(int nivelProficiencia){
        this.setnivelProficiencia(nivelProficiencia);
    }

    public void setnivelProficiencia(int nivelProficiencia){
        this.nivelProficiencia = nivelProficiencia;
    }

    public int getnivelProficiencia(){
        return this.nivelProficiencia;
    }

    public void imprimeRegras(){
        System.out.println("Uma regra da modalidade de Natação é utilizar trajes de banho apropriados");
    }
    public void imprimeObjetivos(){
        System.out.println("Um dos objetivos da modalidade de Natação é trabalhar a respiração e o controle do ar");
    }
}
