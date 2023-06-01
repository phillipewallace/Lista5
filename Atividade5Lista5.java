import java.util.Scanner;
import lib.Matematica;

public class Atividade5Lista5 {
    public static void main(String[] args) {
        int N;

        Scanner scanner = new Scanner(System.in);

        System.out.println("indique um Valor: ");

        N = scanner.nextInt();

        Matematica.imprimirPadrao(N);

        scanner.close();

    }
}
