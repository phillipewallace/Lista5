import java.util.Scanner;
import lib.Matematica;

public class Atividade9Lista5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int numeroInformado = sca.nextInt();
        System.out.println(Matematica.inverteNumero(numeroInformado));
        sca.close();
    }
}