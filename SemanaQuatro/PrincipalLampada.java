public class PrincipalLampada{
    public static void main(String[] args){
        LampadaFluorescente lampadaFluoresc = new LampadaFluorescente(estado, comprimentoLampada);
        LampadaLed lampadaLed = new LampadaLed(estado);
        int escolha;
        System.out.println("Lampada Fluorescente (1) ou Lampada Led? (2)")
        if(escolha == 1){
            if(lampadaFluoresc.getEstado())
                lampadaFluoresc.setComprimentoLampada(false);
            else
                lampadaFluoresc.setComprimentoLampada(true);
        } else {
            if(lampadaLed.getEstado())
                lampadaLed.setComprimentoLampada(false);
            else
                lampadaLed.setComprimentoLampada(true);
        }
    }
}