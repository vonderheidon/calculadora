package br.com.fescfafic.calculadora.Model;

public class Calculadora {

    protected double resultado;

    public Calculadora() {

    }
    public void somar(double num1, double num2) {
        this.resultado = num1 + num2;
        System.out.printf("A soma entre %.0f e %.0f eh %.0f", num1, num2, resultado);
    }
    public void subtrair(double num1, double num2) {
        this.resultado = num1 - num2;
        System.out.printf("A subtracao de %.0f por %.0f eh %.0f", num1, num2, resultado);
    }
    public void multiplicar(double num1, double num2) {
        this.resultado = num1 * num2;
        System.out.printf("A multiplicacao entre %.0f e %.0f eh %.0f", num1, num2, resultado);
    }
    public void dividir(double num1, double num2) {
        this.resultado = num1 / num2;
        System.out.printf("A divisao de %.0f por %.0f eh %.0f", num1, num2, resultado);
    }
}
