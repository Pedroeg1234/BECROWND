import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gnomesteams {

    String nome;
    int idade;

    Gnomesteams(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o próximo inteiro

        ArrayList<Gnomesteams> gnomos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(" ");
            String nome = partes[0];
            int idade = Integer.parseInt(partes[1]);
            gnomos.add(new Gnomesteams(nome, idade));
        }

        ordenardecrescente(gnomos);

        int numTimes = (int) Math.ceil((double) n / 3); // Calcula o número de times necessários
        ArrayList<ArrayList<Gnomesteams>> times = new ArrayList<>();

        for (int i = 0; i < numTimes; i++) {
            times.add(new ArrayList<>());
        }

        int teamIndex = 0;

        for (int i = 0; i < gnomos.size(); i++) {
            times.get(teamIndex).add(gnomos.get(i));
            teamIndex = (teamIndex + 1) % numTimes;
        }

        // Imprime os times
        for (int i = 0; i < numTimes; i++) {
            System.out.println("Time " + (i + 1));
            for (Gnomesteams gnomo : times.get(i)) {
                System.out.println(gnomo.nome + " " + gnomo.idade);
            }
            System.out.println();
        }
    }

    public static void ordenardecrescente(ArrayList<Gnomesteams> gnomos) {
        Collections.sort(gnomos, Comparator.comparingInt(gnomo -> -gnomo.idade));
    }
}
