import java.util.Scanner;

public class Shirt {

    public String nome;
    public String cor;
    public char tamanho;

    public Shirt(String nome, String cor, char tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            Shirt[] shirts = new Shirt[n];

            for (int i = 0; i < n; i++) {
                scanner.nextLine();
                String nome = scanner.nextLine();
                String[] detalhes = scanner.nextLine().split(" ");
                String cor = detalhes[0];
                char tamanho = detalhes[1].charAt(0);

                shirts[i] = new Shirt(nome, cor, tamanho);
            }

            // Ordenar os objetos Shirt usando Selection Sort
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (compareShirts(shirts[j], shirts[minIndex]) < 0) {
                        minIndex = j;
                    }
                }

                // Trocar elementos se necessário
                Shirt temp = shirts[minIndex];
                shirts[minIndex] = shirts[i];
                shirts[i] = temp;
            }

            // Imprimir os objetos Shirt ordenados
            for (Shirt shirt : shirts) {
                System.out.println(shirt.cor + " " + shirt.tamanho + " " + shirt.nome);
            }
        }

        scanner.close();
    }

    private static int compareShirts(Shirt s1, Shirt s2) {
        int colorComparison = s1.cor.compareTo(s2.cor);
        if (colorComparison != 0) {
            return colorComparison;
        }

        int sizeComparison = s2.tamanho - s1.tamanho;
        if (sizeComparison != 0) {
            return sizeComparison;
        }

        return s1.nome.compareTo(s2.nome);
    }
}
