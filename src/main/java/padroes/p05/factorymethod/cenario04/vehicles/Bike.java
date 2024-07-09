package padroes.p05.factorymethod.cenario04.vehicles;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a comida!");
    }
}
