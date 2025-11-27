// === 1. O produto (Product) ===
class Car {
    engine?: string;
    seats?: number;
    color?: string;
    gps?: boolean;

    showDetails() {
        console.log(`Carro com:
                     Motor: ${this.engine}
                     Assentos: ${this.seats}
                     Cor: ${this.color}
                      GPS: ${this.gps ? "Sim" : "Não"}
    `   );
    }
}

// === 2. A interface do Builder ===
interface CarBuilder {
    reset(): void;
    setEngine(engine: string): void;
    setSeats(seats: number): void;
    setColor(color: string): void;
    setGPS(gps: boolean): void;
    getResult(): Car;
}

// === 3. Implementação concreta do Builder ===
class SportsCarBuilder implements CarBuilder {
    private car: Car;

    constructor() {
        this.car = new Car();
    }

    reset(): void {
        this.car = new Car();
    }

    setEngine(engine: string): void {
        this.car.engine = engine;
    }

    setSeats(seats: number): void {
        this.car.seats = seats;
    }

    setColor(color: string): void {
        this.car.color = color;
    }

    setGPS(gps: boolean): void {
        this.car.gps = gps;
    }

    getResult(): Car {
        return this.car;
    }
}

// === 4. O Diretor (Director) ===
class Director {
    private builder!: CarBuilder;

    setBuilder(builder: CarBuilder) {
        this.builder = builder;
    }

    constructSportsCar() {
        this.builder.reset();
        this.builder.setEngine("V8");
        this.builder.setSeats(2);
        this.builder.setColor("Vermelho");
        this.builder.setGPS(true);
    }

    constructCityCar() {
        this.builder.reset();
        this.builder.setEngine("1.0 Flex");
        this.builder.setSeats(4);
        this.builder.setColor("Prata");
        this.builder.setGPS(false);
    }
}

// === 5. Exemplo de uso ===
function main() {
    const director = new Director();
    const builder = new SportsCarBuilder();

    director.setBuilder(builder);

    console.log("🏎️ Criando um carro esportivo:");
    director.constructSportsCar();
    let sportsCar = builder.getResult();
    sportsCar.showDetails();

    console.log("🚙 Criando um carro de cidade:");
    director.constructCityCar();
    let cityCar = builder.getResult();
    cityCar.showDetails();
}

main();
