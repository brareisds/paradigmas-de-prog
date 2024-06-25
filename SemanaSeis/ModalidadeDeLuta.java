public class ModalidadeDeLuta implements ModalidadeEsportiva{
    
    String tipoLuta;

    public ModalidadeDeLuta(String tipoLuta){
        this.setTipoLuta(tipoLuta);
    }

    public void setTipoLuta(String tipoLuta){
        this.tipoLuta = tipoLuta;
    }

    public String getTipoLuta(){
        return this.tipoLuta;
    }

    public void imprimeRegras(){
        System.out.println("Uma regra da modalidade de Luta é o respeito e a segurança dos participantes");
    }
    public void imprimeObjetivos(){
        System.out.println("O objetivo da modalidade de Luta é a competição ou autodefesa");
    }
}
