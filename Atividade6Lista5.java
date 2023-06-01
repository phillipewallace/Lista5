import java.util.Scanner;
import lib.Matematica;

public class Atividade6Lista5 {
    public static void main(String[] args) {

        double NumeroUm;
        double NumeroDois;
        double NumeroTres;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique o primeiro valor:");
        NumeroUm = scanner.nextDouble();

        System.out.println("Indique o segundo valor:");
        NumeroDois = scanner.nextDouble();

        System.out.println("Indique o terceiro valor: ");
        NumeroTres = scanner.nextDouble();

        System.out.println("O resultado da soma e: " + Matematica.soma3(NumeroUm, NumeroDois, NumeroTres));

        scanner.close();

    }
}