import java.util.Scanner;

public class SorthbyLength2 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            String frase = scanner.nextLine();

            String[] partes = frase.split(" ");

            OrdenarFrase(partes);

            System.out.println(frase);
        }
    }

    public static void OrdenarFrase(String[] frase) {

        int n = frase.length;

        for (int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (frase[j].length() > frase[maxIndex].length()) {
                    maxIndex = j;
                }
            }

            String temp = frase[maxIndex];
            frase[maxIndex] = frase[i];
            frase[i] = temp;
        }
    }
}
