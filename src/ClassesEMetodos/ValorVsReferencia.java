package ClassesEMetodos;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println("valor a = " + a + "\n" + "valor b = " + b);
    }
}
