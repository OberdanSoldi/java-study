package desafios;

import java.util.Scanner;

public class DesafioCap1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        String val1 = entrada.nextLine().replace(',', '.');

        System.out.print("Digite o segundo numero: ");
        String val2 = entrada.nextLine().replace(',', '.');

        System.out.print("Digite a operação desejada: (+ - * /)");
        String operador = entrada.nextLine();

        final double num1 = Double.parseDouble(val1);
        final double num2 = Double.parseDouble(val2);

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);

    }
}
