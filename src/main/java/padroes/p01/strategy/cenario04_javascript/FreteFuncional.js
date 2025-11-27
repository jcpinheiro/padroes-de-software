const strategies = {
    sedex: (pedido) => pedido.peso * 12.0,
    pac: (pedido) => pedido.peso * 8.0,
    retirada: () => 0,
};

function calcularFrete(pedido, estrategia) {
    return strategies[estrategia](pedido);
}

const pedido = { peso: 5 };
console.log(calcularFrete(pedido, "sedex"));   // 60
console.log(calcularFrete(pedido, "pac"));     // 40
console.log(calcularFrete(pedido, "retirada"));// 0
