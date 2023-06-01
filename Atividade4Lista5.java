import java.util.Scanner;
import lib.Matematica;

public class Atividade4Lista5 {
    public static void main(String[] args) {
        double NumeroUm;
        double NumeroDois;
        double NumeroTres;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique o valor de A:");
        NumeroUm = scanner.nextDouble();

        System.out.println("Indique o valor de B:");
        NumeroDois = scanner.nextDouble();

        System.out.println("Indique o valor de C:");
        NumeroTres = scanner.nextDouble();

        System.out.println("A media Aritmetica e: " + Matematica.mediaAritm3(NumeroUm, NumeroDois, NumeroTres)
                + "\nA media harmonica e: " + Matematica.mediaHarmonica3(NumeroUm, NumeroDois, NumeroTres)
                + "\nA media Geometrica e: " + Matematica.mediaGeometrica3(NumeroUm, NumeroDois, NumeroTres));

        scanner.close();

    }

}
