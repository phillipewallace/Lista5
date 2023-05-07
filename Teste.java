import java.util.Scanner;
import lib.PirateTest;
import lib.Matematica;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PirateTest.expect(Matematica.soma(2, 1), 3);
        PirateTest.expect(Matematica.soma(12, 24, 1), 37);
        PirateTest.expect(Matematica.subtracao(12, 24), -12);
        PirateTest.expect(Matematica.porcentagem(12, 20), 2.4);
        // PirateTest.expect(Matematica.conversorGraus(33.8), 1);
        // PirateTest.expect(Matematica.mediaHarmonica(3, 2, 1), 2);
        // PirateTest.expect(Matematica.mediaGeometrica(3, 2, 1), 2);
        // PirateTest.expect(Matematica.mediaAritm(3, 2, 1), 2);
        // PirateTest.expect(Matematica.mediaAritm(3, 3), 3);
        // PirateTest.expect(Matematica.inverteNumero(6742), 2476);

        scanner.close();
    }
}