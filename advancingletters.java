import java.util.Scanner;

public class advancingletters {
  public static void main(String[] args) {

  Scanner scanner= new Scanner (System.in);


  String frase=scanner.nextLine();
  String frase2= scanner.nextLine();


  int diferenca=0;
  for (int i=0;i<2;i++){

     diferenca+= frase2.charAt(i)-frase.charAt(i);

    if (diferenca<0){
        diferenca+=26;
    }
  }

  System.out.println(diferenca);
  
  }
}