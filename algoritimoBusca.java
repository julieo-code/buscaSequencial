package playground;

import java.util.Arrays;
import java.util.Random;

public class algoritimoBusca {
    
    public static void main(String[] args) {
        int[] vetor = gerarVetor();
        int numero = gerarNumero();
        percorreVetor(vetor, numero);
    }
    
    public static int gerarNumero(){
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(1001);
        return numeroAleatorio;
    }
    
    public static int[] gerarVetor() {
        long t1 = System.nanoTime();
        int[] vetor = new int[1000];
        int contador = 0;
        int numero;
                
        for (int n : vetor) {
            numero = gerarNumero();
            vetor[contador] = numero;
            contador++;
        }
        long t2 = System.nanoTime();
        double tempo = conversorTempo(t1,t2);
        System.out.printf("O vetor com números aleatórios foi criado em %.2f segundos!\n", tempo);
        return vetor;
    }
    
    public static void percorreVetor(int[] vetor, int numero) {
        boolean encontrou = false;
        long t1 = System.nanoTime();
        for (int n = 0; n < vetor.length; n++) {
            if (vetor[n] == numero) {
                long t2 = System.nanoTime();
                double tempo = conversorTempo(t1,t2);
                System.out.printf("Número %d gerado pela máquina foi encontrado no índice %d do vetor, em %.2f segundos!\n", numero, n, tempo);
                encontrou = true;
                break;
            }
        }
        if (encontrou == false) {
            long t2 = System.nanoTime();
            double tempo = conversorTempo(t1,t2);
            System.out.printf("O número %d NÃO encontrado no vetor!\n", numero, tempo);
        }
    }
    
    public static double conversorTempo(long t1, long t2) {
        double segundos = (t1 - t2) / 1_000_000_000.0;
        return segundos;
    }
}
