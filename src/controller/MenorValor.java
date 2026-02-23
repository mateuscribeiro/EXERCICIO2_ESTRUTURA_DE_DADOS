package controller;


public class MenorValor {

    // Construtor da classe
    public MenorValor() {
    }

    public int encontrarMenor(int[] vetor, int tamanho, int menor) {

        /*
         * CONDIÇÃO DE PARADA:
         * Quando o tamanho for igual a zero, todas as posições do vetor
         * já foram verificadas. O menor valor encontrado é retornado.
         */
        if (tamanho == 0) {
            return menor;
        }

        /*
         * RELAÇÃO DE CHAMADA RECURSIVA:
         * Compara o valor da posição atual com o menor já encontrado.
         * Em seguida, chama o método novamente diminuindo o tamanho do vetor.
         */
        if (vetor[tamanho - 1] < menor) {
            menor = vetor[tamanho - 1];
        }

        return encontrarMenor(vetor, tamanho - 1, menor);
    }
}
