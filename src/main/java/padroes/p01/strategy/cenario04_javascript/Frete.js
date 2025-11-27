// Strategy interface
class FreteStrategy {
   calcular(pedido) {
        throw new Error("Método não implementado!");
    }
}

// Estratégias concretas
class FreteSedex extends FreteStrategy {
    calcular(pedido) {
        return pedido.peso * 12.0;
    }
}

class FretePAC extends FreteStrategy {
    calcular(pedido) {
        return pedido.peso * 8.0;
    }
}

class FreteRetirada extends FreteStrategy {
    calcular(pedido) {
        return 0;
    }
}

// Contexto
class CalculadoraFrete {
    setStrategy(strategy) {
        this.strategy = strategy;
    }

    calcular(pedido) {
        return this.strategy.calcular(pedido);
    }
}

// Uso
const pedido = { peso: 5 };

const calculadora = new CalculadoraFrete();
calculadora.setStrategy(new FreteSedex());
console.log("Sedex:", calculadora.calcular(pedido));

calculadora.setStrategy(new FretePAC());
console.log("PAC:", calculadora.calcular(pedido));

calculadora.setStrategy(new FreteRetirada());
console.log("Retirada:", calculadora.calcular(pedido));
