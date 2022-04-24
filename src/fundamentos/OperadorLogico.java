package fundamentos;

public class OperadorLogico {
    public static void main(String[] args) {

        System.out.println("Tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);

        System.out.println("--------------------------");

        System.out.println("Tabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);

        System.out.println("--------------------------");

        System.out.println("Tabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);

        System.out.println("--------------------------");

        System.out.println("Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
