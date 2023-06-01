import java.util.Scanner;
import lib.Matematica;

public class Atividade8 {
    public static void main(String[] args) {
        double custo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("O custo do produto");
        custo = Double.parseDouble(scanner.nextLine());

        System.out.println("Como você irá informar a taxa de imposto (digite o número da opção)");

        System.out.println("1 - Modo decimal (onde 10% é informado como .1)");
        System.out.println("2 - Modo porcentagem (você pode informar valores como '10%' ou '35%' sem as aspas)");

        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                System.out.println("indique a Taxa de Imposto");
                double taxaEmDecimal = Double.parseDouble(scanner.nextLine());
                System.out.println("O valor final do produto e: " + Matematica.somaImposto(custo, taxaEmDecimal));
                break;
            case 2:
                System.out.println("indique a Taxa de Imposto");
                String taxaEmString = scanner.nextLine();
                System.out.println("O valor final do produto e: " + Matematica.somaImposto(custo, taxaEmString));
                break;
        }

        scanner.close();

    }
}
