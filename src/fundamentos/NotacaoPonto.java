package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        System.out.println(s);

        s = s.replace("X", "Batata");
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        // Tipos primitivos não tem o operador "."
    }
}
