function numeroAleatorio() {
    return Math.floor(Math.random() * 1000 + 1)
}

function gerarVetor() {
    const inicio = Date.now()
    const vetor = []
    for(i = 0; i < 1000; i++)
        vetor.push(numeroAleatorio())
    const final = Date.now()
    const tempo = calculaTempo(inicio, final)
    console.log(`Tempo de criação do vetor: ${tempo.toFixed(5)}`)
    return vetor
}

function percorreVetor(vetor, numero) {
    const inicio = Date.now()
    const encontrou = vetor.indexOf(numero)
    if(encontrou == -1) {
        const final = Date.now()
        const tempo = calculaTempo(inicio, final)
        console.log(`O número ${numero}, NÃO foi encontrado no vetor! O tempo de busca foi ${tempo.toFixed(5)}`)
    } else {
        const final = Date.now()
        const tempo = calculaTempo(inicio, final)
        console.log(`O número ${numero}, foi encontrado no vetor na posição ${encontrou + 1}! O tempo de busca foi ${tempo.toFixed(5)}`)
    }
}

function calculaTempo(inicio, final) {
    return final - inicio
}

function main() {
    const vetor = gerarVetor()
    const numero = numeroAleatorio()
    percorreVetor(vetor, numero)
}

main()