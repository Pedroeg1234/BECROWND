import java.util.Scanner;

public class hiddemmessage {
  public static void main(String[] args) {

  Scanner scanner= new Scanner (System.in);

    String frase=scanner.nextLine();
    String[] partes= frase.split(" ");

    String resp= encontrar(partes);

    System.out.println(resp);


  }


  public static String encontrar(String[] partes){

    StringBuilder combinar= new StringBuilder();
    for (int i=0; i<partes.length; i++){

        char primeiraletra= partes[i].charAt(0);
        combinar.append(primeiraletra);
    }

    return combinar.toString();
  }
}