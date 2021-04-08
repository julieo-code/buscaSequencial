import random
import time

def numeroAleatorio():
    numero = random.randint(0, 1000)
    return numero

def criaVetorAleatorio():
    tempoInicial = time.time()
    vetor = []
    for i in range(1000):
        vetor.append(numeroAleatorio())
    tempoFinal = time.time()
    print('Tempo de criacao total do vetor: {:.5f} segundos.'.format(calcularTempo(tempoInicial, tempoFinal)))
    return vetor

def buscaSequencial(numero, vetor):
    tempoInicial = time.time()
    encontrou = False
    for i in vetor:
        if i == numero:
            encontrou = True
            tempoFinal = time.time()
            calcularTempo(tempoInicial, tempoFinal)
            print('O numero {} foi encontrado na {} posicao do vetor! Tempo de busca total: {:.5f} segundos.'.format(numero ,vetor.index(i), calcularTempo(tempoInicial, tempoFinal)))
            break
    if encontrou == False:
        tempoFinal = time.time()
        calcularTempo(tempoInicial, tempoFinal)
        print('O numero {} NAO foi encontrado no vetor! Tempo de busca total: {:.5f} segundos.'.format(numero, calcularTempo(tempoInicial, tempoFinal)))

def calcularTempo(tempoInicial, tempoFinal):
    return tempoFinal - tempoInicial

def main():
    vetor = criaVetorAleatorio()
    numero = numeroAleatorio()
    buscaSequencial(numero, vetor)

main()