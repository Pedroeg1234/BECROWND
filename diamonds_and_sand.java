import java.util.Scanner;

public class diamonds_and_sand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            int esquerda = 0;
            int diamonds = 0;
            String linha = scanner.nextLine();

            for (int j = 0; j < linha.length(); j++) {
                if (linha.charAt(j) == '<') {
                    esquerda++;
                } else if (linha.charAt(j) == '>' && esquerda > 0) {
                    diamonds++;
                    esquerda--;
                }
            }
            System.out.println(diamonds);
        }
        scanner.close(); 
    }
}
