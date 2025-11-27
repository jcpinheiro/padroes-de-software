const chain = [
    (req, next) => { if (req < 10) console.log("Tratado A"); else next(); },
    (req, next) => { if (req < 50) console.log("Tratado B"); else next(); },
    (req, next) => { console.log("Tratado C"); },
];

function executeChain(request, handlers, index = 0) {
    if (index < handlers.length)
        handlers[index](request, () => executeChain(request, handlers, index + 1));
}

executeChain(7, chain);
executeChain(30, chain);
executeChain(100, chain);


/*
* 👉 executeChain(7, chain)

Primeira função: 7 < 10 → verdadeiro → imprime “Tratado A”.
(Ela não chama next(), então o fluxo para aqui.)

👉 executeChain(30, chain)

Primeira função: 30 < 10 → falso → chama next().

Segunda função: 30 < 50 → verdadeiro → imprime “Tratado B”.
(E para por aqui.)

👉 executeChain(100, chain)

Primeira função: 100 < 10 → falso → passa adiante.

Segunda função: 100 < 50 → falso → passa adiante.

Terceira função: sem condição → imprime “Tratado C”.
* */
