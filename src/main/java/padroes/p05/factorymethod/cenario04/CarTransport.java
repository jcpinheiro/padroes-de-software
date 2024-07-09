package padroes.p05.factorymethod.cenario04;

import padroes.p05.factorymethod.cenario04.vehicles.Car;
import padroes.p05.factorymethod.cenario04.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
