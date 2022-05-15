package desafios;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Netebook", 4356.89);

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.precoComDesconto());
    }
}
