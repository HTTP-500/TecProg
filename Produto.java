package br.edu.fatecpg.conceito.ex.o.k;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    private Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    // Getter para nome
    private String getNome() {
        return nome;
    }

    // Setter para nome
    private void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para preco
    private double getPreco() {
        return preco;
    }

    // Setter para preco
    private void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    // Getter para quantidadeEstoque
    private int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Setter para quantidadeEstoque
    private void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }

    // Método auxiliar para testar a classe
    private static void testarProduto() {
        Produto produto = new Produto("Cadeira", 150.00, 10);

        // Testando os setters com valores válidos e inválidos
        produto.setPreco(-50.00); // Teste com preço negativo
        produto.setQuantidadeEstoque(-5); // Teste com quantidade negativa

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
    }

    // Método main para executar o teste
    public static void main(String[] args) {
        testarProduto();
    }
}

