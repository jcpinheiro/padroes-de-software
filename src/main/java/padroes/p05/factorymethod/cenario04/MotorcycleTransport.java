package padroes.p05.factorymethod.cenario04;


import padroes.p05.factorymethod.cenario04.vehicles.IVehicle;
import padroes.p05.factorymethod.cenario04.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
