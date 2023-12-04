import java.util.Scanner;

public class theonlychance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente após nextInt()

        for (int i = 0; i < n; i++) {

            String frase = scanner.nextLine();
            String fraseordenada = ordenarFrase(frase);

            int contador = 0;
            for (int j = 0; j < frase.length(); j++) {

                if (frase.charAt(j) != fraseordenada.charAt(j)) {
                    contador++;
                }
            }

            if (contador > 2) {
                System.out.println("There aren't chance");
            } else if (contador == 2) {
                System.out.println("There are the chance");
            }
        }
    }

    public static String ordenarFrase(String frase) {
        char[] chars = frase.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            char chave = chars[i];
            int j = i - 1;
            while (j >= 0 && chars[j] > chave) {
                chars[j + 1] = chars[j];
                j = j - 1;
            }
            chars[j + 1] = chave;
        }
        return new String(chars);
    }
}
