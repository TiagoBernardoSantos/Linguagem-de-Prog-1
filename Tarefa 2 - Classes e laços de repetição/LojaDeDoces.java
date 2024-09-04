public class LojaDeDoces {
    private String nome;
    private double preco;
    private int quantidade;

    public LojaDeDoces(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println(quantidadeVendida + " unidades de " + nome + " vendidas.");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void valorTotal() {
        double total = preco * quantidade;
        System.out.println("Valor total em estoque: R$ " + total);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade);
    }
}