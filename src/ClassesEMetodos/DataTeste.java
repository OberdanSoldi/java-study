package ClassesEMetodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        System.out.println(d1.dataFormatada());

        Data d2 = new Data(1, 2, 2000);
        System.out.println(d2.dataFormatada());

    }
}
