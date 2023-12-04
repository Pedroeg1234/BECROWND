import java.util.Scanner;

public class ilhasisoladas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            String[] islandfrom = new String[n];
            String[] islandto = new String[n];

            for (int i = 0; i < n; i++) {
                String entrada = scanner.next(); // Use next() em vez de nextLine() para evitar problemas de leitura
                String[] partes = entrada.split(" -> ");

                islandfrom[i] = partes[0];
                islandto[i] = partes[1];
            }

            boolean invertible = true;
            boolean ehfuncao = true;

            for (int j = 0; j < islandto.length; j++) {
                String ilhaatual = islandto[j];

                for (int k = j + 1; k < islandto.length; k++) {
                    if (ilhaatual.equals(islandto[k])) {
                        invertible = false;
                        break;
                    }
                }
            }

            for (int l = 0; l < islandfrom.length; l++) {
                String ilhafromatual = islandfrom[l];

                for (int m = l + 1; m < islandfrom.length; m++) {
                    if (ilhafromatual.equals(islandfrom[m])) {
                        ehfuncao = false;
                        break;
                    }
                }
            }

            if (invertible) {
                System.out.println("Invertible");
            } else if (!ehfuncao) {
                System.out.println("Not a function");
            } else {
                System.out.println("Not invertible");
            }
        }

        scanner.close();
    }
}
