import java.util.Scanner;

public class CantenQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int tamanho = scanner.nextInt();
            int notas[] = new int[tamanho];

            for (int j = 0; j < tamanho; j++) {
                notas[j] = scanner.nextInt();
            }

            int arraycopiado[] = new int[tamanho];

            System.arraycopy(notas, 0, arraycopiado, 0, notas.length);
            int inalterados = 0;

            selectionSort(notas, tamanho);

            for (int k = 0; k < tamanho; k++) {
                if (arraycopiado[k] == notas[k]) {
                    inalterados++;
                }
            }

            System.out.println(inalterados);

        }
    }

    public static void selectionSort(int[] notas, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            int indiceMaximo = i;
            for (int j = i + 1; j < tam; j++) {
                if (notas[j] > notas[indiceMaximo]) {
                    indiceMaximo = j;
                }
            }
            // Trocar as posições
            int temp = notas[i];
            notas[i] = notas[indiceMaximo];
            notas[indiceMaximo] = temp;
        }
    }
}
