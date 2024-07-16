public class BoloEspecificoFactory extends BoloFactory {
    
    public Bolo criarBolo(String tipoBolo, int quantidade){

        if(tipoBolo.equals("chocolate")){
            return new BoloChocolate(quantidade);
        } else if(tipoBolo.equals("laranja")){
            return new BoloLaranja(quantidade);
        }else
            return null;
    }
}