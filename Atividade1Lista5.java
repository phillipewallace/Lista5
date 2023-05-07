import java.util.Scanner;
import lib.Matematica;
public class Atividade1Lista5 { 
    public static void main (String[] args){
double numero1;
double numero2;
Scanner scanner = new Scanner(System.in);
System.out.println("Primeiro número:"); 
numero1 = scanner.nextDouble();

System.out.println("Segundo número: ");
numero2 = scanner.nextDouble();

System.out.println("Resultado:"+ Matematica.mediaAritm2(numero1,numero2));
scanner.close(); 














    } 
}
