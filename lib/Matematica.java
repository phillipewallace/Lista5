package lib;

public class Matematica {

    public static double soma(double... valores) {
        double resultado = 0;
        for (double valor : valores) {
            resultado += valor;
        }
        return resultado;
    }

    public static double soma2(double num1, double num2) {
        double soma = (num1 + num2);
        return soma;
    }

    public static double soma3(double num1, double num2, double num3) {
        double soma = (num1 + num2 + num3);
        return soma;
    }

    public static double subtracao(double... valores) {
        double resultado = 0;
        for (double valor : valores) {
            resultado -= valor;
        }
        return resultado;
    }

    public static double subtracao2(double num1, double num2) {
        double subtracao = (num1 - num2);
        return subtracao;
    }

    /**
     * Retorna a porcentagem do valor informado
     * 
     * @param valor    - O número que você quer saber a porcentagem
     * @param porcento - Valor da porcentagem (não está no formato de decimal).
     *                 Exemplo: 20, 55...
     */
    public static double porcentagem(double valor, double porcento) {
        return (valor * (porcento / 100));
    }

    public static double conversorGraus(double num1) {
        double conversor = (num1 - 32) / 18 / 10;
        return conversor;

    }

    public static double mediaHarmonica(double... valores) {
        double resultado = 0;
        int quantidade = 0;
        for (double valor : valores) {
            quantidade++;
            resultado += (1 / valor);
        }
        resultado = quantidade / resultado;
        return resultado;
    }

    public static double mediaHarmonica3(double num1, double num2, double num3) {
        double mediaharmonica = (3 / (1 / num1 + 1 / num2 + 1 / num3));
        return mediaharmonica;

    }

    public static double mediaGeometrica(double... valores) {
        double resultado = 0;
        int quantidade = 0;
        for (double valor : valores) {
            quantidade++;
            resultado += (1 / valor);
        }
        resultado = Math.pow(resultado, 1.0 / quantidade);
        return resultado;
    }

    public static double mediaGeometrica3(double num1, double num2, double num3) {
        double mediageo = Math.cbrt(num1 * num2 * num3);

        return mediageo;
    }

    public static double mediaAritm(double... valores) {
        double resultado = 0;
        int quantidade = 0;
        for (double valor : valores) {
            quantidade++;
            resultado += valor;
        }
        resultado = resultado / quantidade;
        return resultado;
    }

    public static double mediaAritm2(double num1, double num2) {
        double media = (num1 + num2) / 2;
        return media;

    }

    public static double mediaAritm3(double num1, double num2, double num3) {
        double media = (num1 + num2 + num3) / 3;
        return media;

    }

    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int inverteNumero(int numero) {
        String numeroEmString = String.valueOf(numero);
        String numeroInvertido = "";
        int inicioDoCorte = numeroEmString.length() - 1, fimDoCorte = numeroEmString.length();
        while (numeroEmString.length() != 0) {
            numeroInvertido += numeroEmString.substring(inicioDoCorte, fimDoCorte);
            inicioDoCorte = numeroEmString.length() - 2;
            fimDoCorte = numeroEmString.length() - 1;
            numeroEmString = numeroEmString.substring(0, fimDoCorte);
        }
        int resultado = Integer.parseInt(numeroInvertido);
        return resultado;
    }
}