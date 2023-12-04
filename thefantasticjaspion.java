import java.util.Scanner;


public class thefantasticjaspion{
public static void main(String[] args){

    Scanner scanner= new Scanner (System.in);


    int n=scanner.nextInt();
    

   
    for (int i=0;i<n;i++){

        int m=scanner.nextInt();
        int frases=scanner.nextInt();

         String frase[]= new String[m];
         String traducao[]=new String[m];
    
         scanner.nextLine(); // Consumir a nova linha após o próximo inteiro

        for (int j=0;j<m;j++){

            frase[j]=scanner.nextLine();
            traducao[j]=scanner.nextLine();
        }
            for (int k=0;k<frases;k++){

                String entrada=scanner.nextLine();

                for (int l=0;l<frase.length;l++){

                    if (frase[l].equals(entrada)){

                        System.out.println(traducao[l]);
                        break;
                    }
                }
            }
        }

    
    }
}
