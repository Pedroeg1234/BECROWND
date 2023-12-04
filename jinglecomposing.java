import java.util.Scanner;

public class jinglecomposing{

    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);

        while (true){

            

            String entrada=scanner.nextLine();

            if (entrada.equals("*")){
                break;
            }

            int contador=0;
             String partes[]= entrada.split("/");

            for (int i=0;i<partes.length;i++){

                String parteatual=partes[i];
                
                double somaparte=0;
                for (int j=0;j<parteatual.length();j++){

                    char letraatual=parteatual.charAt(j);

                    somaparte+=valor(letraatual);


                  }

                  if (somaparte==1.0){
                    contador++;
                  }


            }

         System.out.println (contador);
            
        }

    }

    public static double valor(char letraatual){

        switch (letraatual){

            case 'W':

            return 1.0;
            
            case 'H':
            return 0.5;

            case 'Q':
            return 0.25;

            case 'E':
            return 0.125;

            case 'S':

            return 0.0625;

            case 'T':
            return 0.03125;

            case 'X':
            return 0.015625;

            default:
            return 0;

        }
        
    }
}