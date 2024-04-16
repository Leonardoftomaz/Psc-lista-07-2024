import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, soma = 0, media = 0;
        int quantidade = 0, acimaMedia = 0, abaixoSete = 0;
        
        System.out.println("Digite as notas:");
        do {
            nota = sc.nextDouble();
            if (nota != -1) {
                soma += nota;
                quantidade++;
                if (nota > media) {
                    acimaMedia++;
                }
                if (nota < 7) {
                    abaixoSete++;
                }
            }
        } while (nota != -1);
        
        media = soma / quantidade;
        
        System.out.printf("Quantidade de notas: %d%n", quantidade);
        System.out.print("Notas: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%.1f ", nota);
        }
        System.out.printf("%nNotas em ordem inversa:%n");
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.printf("%.1f%n", nota);
        }
        System.out.printf("Soma das notas: %.1f%n", soma);
        System.out.printf("Média das notas: %.1f%n", media);
        System.out.printf("Número de notas acima da média: %d%n", acimaMedia);
        System.out.printf("Número de notas abaixo de sete: %d%n", abaixoSete);
        System.out.println("Fim do programa.");
        
        sc.close();
    }
}
