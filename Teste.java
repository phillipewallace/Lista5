import java.util.Scanner;
import Importação.matematica;

public class Teste {
 public static void main (String[] args){
Matematica matematica = new Matematica();
double NumeroDois;
double NumeroUm;

Scanner scanner = new Scanner(System.in);

System.out.println("Escreva o primeiro valor:");
NumeroUm = scanner.nextInt();

System.out.println("Escreva o segundo valor:");
NumeroDois = scanner.nextInt();

System.out.println("a soma de ambos e:" + matematica.Soma2(NumeroUm,NumeroDois));
System.out.println("a subtração de ambos e:" + matematica.Subtracao(NumeroUm,NumeroDois));
System.out.println("a media de ambos e:" + matematica.MediaAritm2(NumeroUm,NumeroDois));





scanner.close();


















 }
}