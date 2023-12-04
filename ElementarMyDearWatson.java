import java.util.Scanner;

public class ElementarMyDearWatson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número de casos de teste

        for (int i = 0; i < n; i++) {
            int quantidade = scanner.nextInt();
            int vet[] = new int[quantidade];

            for (int j = 0; j < quantidade; j++) {
                vet[j] = scanner.nextInt();
            }

            int resp = contarTrocas(vet);
            System.out.println(resp);
        }
    }

    public static int contarTrocas(int partes[]) {
        int swaps = 0;

        for (int i = 0; i < partes.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < partes.length; j++) {
                if (partes[j] < partes[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = partes[i];
                partes[i] = partes[minIndex];
                partes[minIndex] = temp;
                swaps++;
            }
        }

        return swaps;
    }
}
