import java.util.Scanner;

public class combiner {
  public static void main(String[] args) {

  Scanner scanner= new Scanner (System.in);

  String frase1=scanner.nextLine();
 
  String frase2=scanner.nextLine();

  String resposta= combinar(frase1,frase2);

  System.out.println(resposta);
  }

  public static String combinar(String frase1, String frase2){

    StringBuilder combinador= new StringBuilder();

    int tam= Math.max(frase1.length(),frase2.length());

    for (int i=0; i<tam;i++){

        if (i<frase1.length()){
            combinador.append(frase1.charAt(i));
        }

        if (i<frase2.length()){
            combinador.append(frase2.charAt(i));
        }
    }

    return combinador.toString();
  }
}