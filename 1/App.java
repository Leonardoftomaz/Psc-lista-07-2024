import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> temperatures = new ArrayList<Float>();
        ArrayList<String> months = new ArrayList<String>();
        months.add("Janeiro");
        months.add("Fevereiro");
        months.add("Marco");
        months.add("Abril");
        months.add("Maio");
        months.add("Junho");
        months.add("Julho");
        months.add("Agosto");
        months.add("Setembro");
        months.add("Outubro");
        months.add("Novembro");
        months.add("Dezembro");
        Float mediaAnual = 0f;
        Float temp;
        for (int i = 0; i < 12; i++) {
            System.out.printf("Digite a temperatura media de %s: ", months.get(i));
            temp = input.nextFloat();
            temperatures.add(temp);
            mediaAnual += temp;
        }
        mediaAnual /= 12;
        System.out.printf("\nA media anual das temperaturas e: %.2f\n", mediaAnual);
        System.out.println("As temperaturas acima da media anual sao: ");
        for (int i = 0; i < 12; i++) {
            if (temperatures.get(i) > mediaAnual) {
                System.out.printf("%s com %.2f\n", months.get(i), temperatures.get(i));
            }
        }
        input.close();
    }
}