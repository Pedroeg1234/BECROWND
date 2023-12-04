import java.util.Scanner;

public class dancingsentence {
  public static void main(String[] args) {

  Scanner scanner= new Scanner (System.in);

  String frase= scanner.nextLine();

  String resposta= dancing (frase);
  System.out.println(resposta);
  
  }

  public static String dancing (String frase){

  
    StringBuilder combinador= new StringBuilder();
    boolean maiuscula=true;

    for (int i=0; i<frase.length();i++){

      char posicaoatual=frase.charAt(i);

      if (Character.isLetter(posicaoatual)){

        if (maiuscula){

            char letramaiuscula= Character.toUpperCase(posicaoatual);
            combinador.append(letramaiuscula);
        }

        else{

            char letraminuscula= Character.toLowerCase(posicaoatual);
            combinador.append(letraminuscula);
        }

        maiuscula=!maiuscula;
      }

      else{
        combinador.append(posicaoatual);
      }

  }

   return combinador.toString();
}
}