import java.util.Scanner;
import lib.Matematica;
    public class Atividade3Lista5{
public static void main (String[] args) {
double temperatura;
Scanner scanner = new Scanner(System.in);
System.out.println("Temperatura: ");

temperatura = scanner.nextDouble();

System.out.println("Graus centígrados:"+ Matematica.conversorGraus(temperatura));
scanner.close();

}
    
}
