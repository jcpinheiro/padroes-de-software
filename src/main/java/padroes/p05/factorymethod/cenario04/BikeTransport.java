package padroes.p05.factorymethod.cenario04;


import padroes.p05.factorymethod.cenario04.vehicles.Bike;
import padroes.p05.factorymethod.cenario04.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
