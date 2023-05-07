package lib;

public final class PirateTest {
    public static boolean expect(int test, int expected) {
        boolean result = test == expected;
        if (result == false)
            System.out.println("O teste falhou. Esperava " + expected + " mas foi recebido " + test);
        else {
            System.out.println("O teste passou!");
        }
        return result;
    }

    public static boolean expect(double test, double expected) {
        boolean result = test == expected;
        if (result == false)
            System.out.println("O teste falhou. Esperava " + expected + " mas foi recebido " + test);
        else {
            System.out.println("O teste passou!");
        }
        return result;
    }

    public static boolean expect(String test, String expected) {
        boolean result = test == expected;
        if (result == false)
            System.out.println("O teste falhou. Esperava " + expected + " mas foi recebido " + test);
        else {
            System.out.println("O teste passou!");
        }
        return result;
    }

    public static boolean expect(char test, char expected) {
        boolean result = test == expected;
        if (result == false)
            System.out.println("O teste falhou. Esperava " + expected + " mas foi recebido " + test);
        else {
            System.out.println("O teste passou!");
        }
        return result;
    }
}