package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Info de funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 32;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumuladosL = 3_234_845_223L; // Usando a letra L para definir literal
        long pontosAcumulados = 1_234_845_223; // Dentro do limite long

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2;

        // Tipo boolean
        boolean estaDeFerias = false; // Ou true

        // Tipo caractere
        char status = 'A';

        System.out.println("Anos de empresa: " + anosDeEmpresa * 360);
        System.out.println("Voos: " + numeroDeVoos / 2);
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println("id: " + id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
