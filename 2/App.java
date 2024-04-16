import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveResponses = 0;

        System.out.println("**Crime Program**");
        System.out.println();
        System.out.println("Responda as seguintes perguntas com 'sim' ou 'não':");

        System.out.println("1. Telefonou para a vítima?");
        if (scanner.nextLine().equalsIgnoreCase("sim")) {
            positiveResponses++;
        }

        System.out.println("2. Esteve no local do crime?");
        if (scanner.nextLine().equalsIgnoreCase("sim")) {
            positiveResponses++;
        }

        System.out.println("3. Mora perto da vítima?");
        if (scanner.nextLine().equalsIgnoreCase("sim")) {
            positiveResponses++;
        }

        System.out.println("4. Devia para a vítima?");
        if (scanner.nextLine().equalsIgnoreCase("sim")) {
            positiveResponses++;
        }

        System.out.println("5. Já trabalhou com a vítima?");
        if (scanner.nextLine().equalsIgnoreCase("sim")) {
            positiveResponses++;
        }

        System.out.println();
        switch (positiveResponses) {
            case 2:
                System.out.println("**Classificação**: Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("**Classificação**: Cúmplice");
                break;
            case 5:
                System.out.println("**Classificação**: Assassino");
                break;
            default:
                System.out.println("**Classificação**: Inocente");
        }
        scanner.close();
    }
}