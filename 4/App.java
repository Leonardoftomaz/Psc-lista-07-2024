import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] contadores = new int[9];

        System.out.println("Digite o total de vendas para cada vendedor:");
        int vendas = scanner.nextInt();
        while (vendas >= 0) {
            
            double salario = 200 + 0.09 * vendas;

            int faixa = 0;
            if (salario >= 1000) {
                faixa = 8;
            } else {
                faixa = (int) Math.ceil((salario - 200) / 100);
            }

            contadores[faixa]++;

            vendas = scanner.nextInt();
        }

        System.out.println("\nNúmero de vendedores com salários nas seguintes faixas:");
        for (int i = 0; i < contadores.length; i++) {
            int limiteInferior = 200 + i * 100;
            int limiteSuperior = 200 + (i + 1) * 100 - 1;
            System.out.printf("R$%d - R$%d: %d\n", limiteInferior, limiteSuperior, contadores[i]);
        }
        scanner.close();
    }
}
