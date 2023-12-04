import java.util.Scanner;

public class haypoints {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int m = scanner.nextInt();
        scanner.nextLine();

        String words[] = new String[n];
        int salario[] = new int[n];

        for (int i = 0; i < n; i++) {
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(" ");
            words[i] = partes[0];
            salario[i] = Integer.parseInt(partes[1]);
        }

        for (int j = 0; j < m; j++) {
            String texto = scanner.nextLine();
            int resultado = 0;
            String partes[]=texto.split(" ");

            for (int k=0;k<partes.length;k++){
                String parteatual=partes[k];

            for (int l=0; l<words.length;l++){

                if (words[l].equals(parteatual)){
                    resultado+=salario[l];
                }
            }
            }

            
            System.out.println(resultado);
        }
    }
}
