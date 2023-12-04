
import java.util.Scanner;

public class barbecueatYuri{

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner (System.in);

        int n=scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente após ler o valor de n

        String carne[]= new String [n];
        int quantidade[] = new int[n];

        for (int i=0;i<n;i++){

            String alimentos=scanner.nextLine();

            String partes[]=alimentos.split(" ");

            carne[i]=partes[0];
            quantidade[i]= Integer.parseInt( partes[1]);
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (carne[j].compareTo(carne[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            String tempCarne = carne[minIndex];
            carne[minIndex] = carne[i];
            carne[i] = tempCarne;

            int tempQuantidade = quantidade[minIndex];
            quantidade[minIndex] = quantidade[i];
            quantidade[i] = tempQuantidade;
        }

        for (int i=0;i<n;i++){

            System.out.println (carne[i]);

        }
    }
}