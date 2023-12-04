import java.util.Scanner;

public class OutstandingIssues{

public static void main(String [] args){


    Scanner scanner= new Scanner (System.in);


    String parenteses= scanner.nextLine();

    int esquerda=0;
    int direita=0;
    int diferenca=0;
    for (int i=0; i<parenteses.length(); i++){

        if (parenteses.charAt(i)== '('){
            esquerda++;
        }

        if (parenteses.charAt(i)== ')'){
            direita++;
        }

    }

    if (esquerda > direita){

        diferenca= esquerda-direita;
    } else {

        diferenca= direita-esquerda;
    }
    if (esquerda==direita){
        System.out.println ("Partiu RU");
    } else {

        System.out.println ("Voce tem" + diferenca + "pendecias");
    }

}
    
}