import java.util.Scanner;

public class goingtothemarket{


    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            int m=scanner.nextInt();
            scanner.nextLine();

            String produtos[]= new String[m];
            double precos[]=new double[m];

            for (int j=0;j<m;j++){

                String frase=scanner.nextLine();

                String partes[]= frase.split(" ");
                produtos[j]=partes[0];
                precos[j]= Double.parseDouble(partes[1]);
            }

            int quantidadeentradas=scanner.nextInt();
            double valor=0;

            for (int k=0;k<quantidadeentradas;k++){

                String entrada=scanner.nextLine();

                for (int l=0;l<produtos.length;l++){

                    if (produtos[l].equals(entrada)){

                        valor+=precos[l];
                        
                    }
                }
            }

            System.out.println(valor);

        }



    }
}