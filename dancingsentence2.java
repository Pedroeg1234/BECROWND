import java.util.Scanner;

public class dancingsentence2 {
  public static void main(String[] args) {

  Scanner scanner= new Scanner (System.in);

  String frase= scanner.nextLine();

  boolean maiusculo=true;

  StringBuilder combinador= new StringBuilder();
  for (int i=0; i<frase.length();i++){

    char caractereatual= frase.charAt(i);

    if (Character.isLetter(caractereatual)){

    if (maiusculo){
    char letramaiuscula= Character.toUpperCase(caractereatual);
    combinador.append(letramaiuscula);
    } else{

        char letraminuscula= Character.toLowerCase(caractereatual);
        combinador.append(letraminuscula);
    }

     maiusculo= !maiusculo;
 }

 else{
    combinador.append(caractereatual);
 }
   

  }

    System.out.println (combinador);
  }
}