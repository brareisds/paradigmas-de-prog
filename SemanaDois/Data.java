public class Data {

    int dia;
    int mes;
    int ano;

    public void ajustarData(int dia, int mes, int ano){
        this.dia = dia;
        this. mes = mes;
        this.ano = ano;
    }

    public void imprimirData(){
        if(dia<10)
            System.out.print("0" + dia + "/");
        else
            System.out.print(dia + "/");

        if(mes<10)
            System.out.print("0" + mes + "/");
        else
            System.out.print(mes + "/");

        System.out.println(ano);
    }
}
