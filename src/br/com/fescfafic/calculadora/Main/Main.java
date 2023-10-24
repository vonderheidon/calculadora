package br.com.fescfafic.calculadora.Main;

import br.com.fescfafic.calculadora.Model.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        String operacao;
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("- para subtrair");
        System.out.println("+ para somar");
        System.out.println("* para multiplicar");
        System.out.println("/ para dividir");
        try {
            System.out.print("Digite a operacao desejada: ");
            operacao = scanner.nextLine();
            System.out.print("Digite o primeiro numero: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite o segundo numero: ");
            num2 = scanner.nextDouble();
            switch (operacao) {
                case "/":
                    calculadora.dividir(num1, num2);
                    break;
                case "-":
                    calculadora.subtrair(num1, num2);
                    break;
                case "*":
                    calculadora.multiplicar(num1, num2);
                    break;
                case "+":
                    calculadora.somar(num1, num2);
                    break;
                default:
                    System.out.println("A operacao informada eh invalida.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.print("O valor informado eh invalido!");
        } catch (ArithmeticException e) {
            System.out.println("Erro de calculo");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("\nOperação concluída!");
        }

    }
}