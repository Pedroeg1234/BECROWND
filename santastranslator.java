import java.util.Scanner;

public class santastranslator{


    public static void main(String[] args){

        Scanner scanner=new Scanner (System.in);

        String[] countries = {
            "brasil", "alemanha", "austria", "coreia", "espanha", 
            "grecia", "estados-unidos", "inglaterra", "australia", 
            "portugal", "suecia", "turquia", "argentina", "chile", 
            "mexico", "antardida", "canada", "irlanda", "belgica", 
            "italia", "libia", "siria", "marrocos", "japao"
        };

        String[] phrases = {
            "Feliz Natal!", "Frohliche Weihnachten!", "Frohe Weihnacht!", 
            "Chuk Sung Tan!", "Feliz Navidad!", "Kala Christougena!", 
            "Merry Christmas!", "Merry Christmas!", "Merry Christmas!", 
            "Feliz Natal!", "God Jul!", "Mutlu Noeller", "Feliz Navidad!", 
            "Feliz Navidad!", "Feliz Navidad!", "Merry Christmas!", 
            "Merry Christmas!", "Nollaig Shona Dhuit!", "Zalig Kerstfeest!", 
            "Buon Natale!", "Buon Natale!", "Milad Mubarak!", "Milad Mubarak!", 
            "Merii Kurisumasu!"
        };


        for (int i=0;i<1;i++){

            String entrada=scanner.nextLine();

            for (int k=0;k<countries.length;k++){

                if (countries[k].equals(entrada)){
                    System.out.println(phrases[k]);
                }
            }
        }
    }
}