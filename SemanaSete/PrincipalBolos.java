public class PrincipalBolos {

    public static void main(String[] args) {

        BoloFactory boloFactory = new BoloEspecificoFactory();
        Bolo boloChocolate = boloFactory.criarBolo("chocolate", 2);
        Bolo boloLaranja = boloFactory.criarBolo("laranja", 3);

        if (boloChocolate != null && boloLaranja != null) {
            boloChocolate.assar();
            boloChocolate.decorar();
            boloLaranja.assar();
            boloLaranja.decorar();
        } else {
            System.out.println("Bolo não encontrado");
        }
    }
}