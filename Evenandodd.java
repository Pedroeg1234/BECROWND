import java.util.Scanner;

public class Evenandodd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = scanner.nextInt();

        int[] pares = new int[quantidadeNumeros];
        int[] impares = new int[quantidadeNumeros];
        int contador = 0;
        int contadorImpar = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                pares[contador] = num;
                contador++;
            } else {
                impares[contadorImpar] = num;
                contadorImpar++;
            }
        }

        // Ordena os arrays de pares e ímpares em ordem crescente
        selectionsort(pares, contador);
        selectionsort(impares, contadorImpar);

        // Imprime os números pares ordenados em ordem crescente
        System.out.println("Números pares em ordem crescente:");
        for (int i = 0; i < contador; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        // Imprime os números ímpares ordenados em ordem crescente
        System.out.println("Números ímpares em ordem crescente:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        // Ordena os arrays de pares e ímpares em ordem decrescente
        selectionsortdecrescente(pares, contador);
        selectionsortdecrescente(impares, contadorImpar);

        // Imprime os números pares ordenados em ordem decrescente
        System.out.println("Números pares em ordem decrescente:");
        for (int i = 0; i < contador; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        // Imprime os números ímpares ordenados em ordem decrescente
        System.out.println("Números ímpares em ordem decrescente:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }

    public static void selectionsort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionsortdecrescente(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
