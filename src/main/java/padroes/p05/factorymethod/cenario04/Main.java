package padroes.p05.factorymethod.cenario04;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);
        if(transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch(type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log" :
                transport = new MotorcycleTransport();
                break;
            case "eats" :
                transport = new BikeTransport();
                break;
            default :
                System.out.println("Selecione o tipo de entrega");
        }
    }
}
