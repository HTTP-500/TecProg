package br.edu.fatecpg.conceito.ex.o.k;

public class Carroex {
    private double capacidadeTanque; // Capacidade do tanque em litros

    // Construtor
    private Carroex(double capacidadeTanque) {
        setCapacidadeTanque(capacidadeTanque);
    }

    // Getter para capacidadeTanque
    private double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // Setter para capacidadeTanque
    private void setCapacidadeTanque(double capacidadeTanque) {
        if (capacidadeTanque > 0) {
            this.capacidadeTanque = capacidadeTanque;
        } else {
            System.out.println("A capacidade do tanque deve ser positiva.");
        }
    }

    // Método para calcular o valor total para encher o tanque
    private double calcularValorTotal(double valorGasolina) {
        return getCapacidadeTanque() * valorGasolina;
    }

    // Método auxiliar para testar a classe
    private static void testarCarroex() {
    	Carroex Carroex = new Carroex(50); // Exemplo com um tanque de 50 litros
        double valorGasolina = -5.50; // Valor da gasolina por litro

        // Calcula o valor total para encher o tanque
        double valorTotal = Carroex.calcularValorTotal(valorGasolina);
        System.out.println("Valor total para encher o tanque: R$ " + valorTotal);
    }

    // Método main para executar o teste
    public static void main(String[] args) {
        testarCarroex();  
    }
}