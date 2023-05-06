public class Matematica {

public double Soma2 (double num1, double num2){
 double soma = (num1 + num2);
    return soma;
}
public double Soma3 (double num1, double num2,double num3){
    double soma = (num1 + num2 + num3);
       return soma;
   }

public double Subtracao(double num1, double num2){
    double subtracao = (num1 - num2);
    return subtracao;
}



public double Porcentagem (double num1,double num2){
    
    double porcentagem = ( num1 * num2/100);
    return porcentagem;

}

public double ConversorGraus (double num1){
    double conversor = (num1- 32)/18/10;
    return conversor;

}

public double MediaHarmonica(double num1,double num2,double num3){
double mediaharmonica = (3/1/num1+1/num2+1/num3);
return mediaharmonica;

}

public double MediaGeometrica (double num1, double num2, double num3){

   double mediageo = math.crbt((num1*num2*num3));

    return mediageo;
}
public double MediaAritm2 (double num1,double num2){
    double media = (num1 + num2)/2;
    return media;
    
    }
public double MediaAritm3 (double num1,double num2,double num3){
        double media = (num1 + num2 + num3)/3;
        return media;
        
        }








}