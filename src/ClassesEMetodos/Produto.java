package ClassesEMetodos;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
    double precoComDesconto(double DescontoDoGerente) {
        return preco * (1 - desconto + DescontoDoGerente);
    }
}
