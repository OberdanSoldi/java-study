package desafios;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salario: ");
        String s1 = entrada.nextLine();

        System.out.print("Digite o segundo salario: ");
        String s2 = entrada.nextLine();

        System.out.print("Digite o terceiro salario: ");
        String s3 = entrada.nextLine();

        final double convertedS1 = Double.parseDouble(s1.replace(',', '.'));
        final double convertedS2 = Double.parseDouble(s2.replace(',', '.'));
        final double convertedS3 = Double.parseDouble(s3.replace(',', '.'));

        final var soma = convertedS1 + convertedS2 + convertedS3;
        final var resultado = soma / 3;
        System.out.println(resultado);
    }
}
