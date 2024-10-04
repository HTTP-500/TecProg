package br.edu.fatecpg.conceito.ex.o.k;

public class ContaBancaria {
    private double saldo;
    private String titular;

    // Construtor privado
    private ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial é 0
    }

    // Getter privado para saldo
    private double getSaldo() {
        return saldo;
    }

    // Getter privado para titular
    private String getTitular() {
        return titular;
    }

    // Método privado para depositar dinheiro
    private void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método privado para sacar dinheiro
    private void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Valor inválido para saque. Certifique-se de que o valor seja positivo e não exceda o saldo, *teste valor negativo*.");
        }
    }

    // Método público para criar uma instância de ContaBancaria
    public static ContaBancaria criarContaBancaria(String titular) {
        return new ContaBancaria(titular);
    }

    // Método privado para testar a classe
    private static void testarContaBancaria() {
        ContaBancaria conta = criarContaBancaria("João da Silva");

        conta.depositar(1000.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(500.00);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        conta.sacar(-100.00); // Teste com valor negativo
        conta.sacar(600.00); // Teste com valor maior que o saldo
    }

    // Método main para executar o teste
    public static void main(String[] args) {
        testarContaBancaria();
    }
}
