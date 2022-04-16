package desafios;

public class Variaveis {
    public static void main(String[] args) {
        final double FATOR = 5.0 / 9.0;
        final int AJUSTE = 32;
        double fh = 32;

        double formula = (fh - AJUSTE) * FATOR;

        System.out.println("Result: " + formula);
    }
}
