package padroes.p05.factorymethod.cenario04;


import padroes.p05.factorymethod.cenario04.vehicles.IVehicle;

public abstract class Transport {

    final void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
