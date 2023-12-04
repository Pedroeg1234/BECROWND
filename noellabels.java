import java.util.Scanner;

public class noellabels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Consumir a quebra de linha pendente
        scanner.nextLine();

        String idioma[] = new String[n];
        String traducao[] = new String[n];

        for (int i = 0; i < n; i++) {
            idioma[i] = scanner.nextLine();
            traducao[i] = scanner.nextLine();
        }

        for (int i = 0; i < m; i++) {
            String nome = scanner.nextLine();
            String idioma2 = scanner.nextLine();

            for (int l = 0; l < idioma.length; l++) {
                if (idioma[l].equals(idioma2)) {
                    System.out.println(nome + " " + traducao[l]);
                }
            }
        }
    }
}
