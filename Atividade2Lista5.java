import java.util.Scanner;
import lib.Matematica;

public class Atividade2Lista5 {
   public static void main(String[] args) {
      double valor;
      double porcento = 10;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Insira o preço do produto");
      valor = scanner.nextDouble();

      System.out.printf("Novo valor do produto: " + Matematica.soma2(valor, Matematica.porcentagem(valor, porcento)));

      scanner.close();

   }
}