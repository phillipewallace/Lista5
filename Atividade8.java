import java.util.Scanner;
import lib.Matematica;

public class Atividade8 {
    public static void main(String[] args) {
     double TaxaImposto;
    double Custo;

    Scanner scanner = new Scanner(System.in);

    System.out.println("O custo do produto");
    Custo = scanner.nextDouble();

    System.out.println("indique a Taxa de Imposto");
    TaxaImposto = scanner.nextDouble();

System.out.println("O valor final do produto e: " + Matematica.somaImposto(Custo, TaxaImposto));

scanner.close();






    }
}
