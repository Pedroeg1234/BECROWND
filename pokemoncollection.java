import java.util.Scanner;

public class pokemoncollection {
  public static void main(String[] args) {

  Scanner scanner= new Scanner (System.in);


  int qntdpokemon= 150;
  
  int n=scanner.nextInt();
  scanner.nextLine();
  String[] pokemon= new String[n];
  int elementounico=0;

  for (int i=0;i<n;i++){
   
    pokemon[i]=scanner.nextLine();
     boolean unico=true;

    for (int j=0; j<i;j++){

        if (i!=j && pokemon[i].equals(pokemon[j])){
         
            unico=false;
            break;
        }
    }
        if (unico){
        elementounico++;
    }
}
    
       System.out.println(elementounico);

       
    }

 
    }

