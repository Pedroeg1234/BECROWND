import java.util.Scanner;

public class internationalchat {
  public static void main(String[] args) {

  Scanner scanner= new Scanner (System.in);

  String idioma[]= new String[3];

  for (int i=0; i<idioma.length;i++){

    idioma[i]=scanner.nextLine();
  }

  String resposta= chat(idioma);

  System.out.println(resposta);

  }

  public static String chat (String [] idioma){

    for (int i=1; i<idioma.length; i++){

        String idiomaatual= idioma[i];
        String idiomaanterior= idioma[i-1];

        if (!idiomaatual.equals(idiomaanterior)){
            return "INGLES";
        }

        idiomaanterior=idiomaatual;
    }

    return idioma[0];
  }
}