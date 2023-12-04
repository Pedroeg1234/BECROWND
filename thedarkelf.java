import java.util.*;

class Reindeer implements Comparable<Reindeer> {
    String nome;
    int peso;
    int idade;
    double altura;

    Reindeer(String nome, int peso, int idade, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Reindeer outroRena) {
        // Ordena em ordem decrescente de peso
        if (this.peso != outroRena.peso) {
            return Integer.compare(outroRena.peso, this.peso);
        }
        // Se tiverem o mesmo peso, ordena em ordem crescente de idade
        if (this.idade != outroRena.idade) {
            return Integer.compare(this.idade, outroRena.idade);
        }
        // Se tiverem o mesmo peso e idade, ordena em ordem crescente de altura
        if (this.altura != outroRena.altura) {
            return Double.compare(this.altura, outroRena.altura);
        }
        // Se tiverem o mesmo peso, idade e altura, ordena por nome em ordem alfabética
        return this.nome.compareTo(outroRena.nome);
    }
}

public class thedarkelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Número de casos de teste

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt(); // Número total de renas
            int M = scanner.nextInt(); // Número de renas que puxarão o trenó

            List<Reindeer> renas = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                String nome = scanner.next();
                int peso = scanner.nextInt();
                int idade = scanner.nextInt();
                double altura = scanner.nextDouble();
                
                renas.add(new Reindeer(nome, peso, idade, altura));
            }

            // Ordena a lista de renas
            Collections.sort(renas);

            // Imprime o resultado para o cenário atual
            System.out.println("CENARIO {" + i + "}");
            for (int k = 0; k < M; k++) {
                System.out.println((k + 1) + " - " + renas.get(k).nome);
            }
        }
    }
}
