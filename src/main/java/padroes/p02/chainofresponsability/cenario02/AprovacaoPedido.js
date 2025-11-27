// Classe base Handler
class Handler {
    setNext(handler) {
        this.next = handler;
        return handler; // permite encadear
    }

    handle(request) {
        if (this.next) {
            return this.next.handle(request);
        }
        return null;
    }
}

// Handlers concretos
class Gerente extends Handler {
    handle(request) {
        if (request.valor <= 1000) {
            console.log("Gerente aprovou o pedido de R$" + request.valor);
        } else {
            console.log("Gerente passou adiante...");
            return super.handle(request);
        }
    }
}

class Diretor extends Handler {
    handle(request) {
        if (request.valor <= 5000) {
            console.log("Diretor aprovou o pedido de R$" + request.valor);
        } else {
            console.log("Diretor passou adiante...");
            return super.handle(request);
        }
    }
}

class CEO extends Handler {
    handle(request) {
        if (request.valor > 5000) {
            console.log("CEO aprovou o pedido de R$" + request.valor);
        } else {
            return super.handle(request);
        }
    }
}

// Configuração da cadeia
const gerente = new Gerente();
const diretor = new Diretor();
const ceo = new CEO();

gerente.setNext(diretor).setNext(ceo);

// Cliente envia requisições
gerente.handle({ valor: 800 });
gerente.handle({ valor: 3500 });
gerente.handle({ valor: 10000 });
