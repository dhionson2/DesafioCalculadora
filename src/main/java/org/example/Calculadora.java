package org.example;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Solicitar ao usuário para inserir dois valores
            System.out.print("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();

            // Solicitar ao usuário para escolher uma operação10
            System.out.println("Escolha a operação:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            int escolha = scanner.nextInt();

            // Realizar a operação escolhida
            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + (valor1 + valor2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (valor1 - valor2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (valor1 * valor2));
                    break;
                case 4:
                    if (valor2 != 0) {
                        System.out.println("Resultado: " + (valor1 / valor2));
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            // Perguntar ao usuário se deseja reiniciar
            System.out.print("Deseja reiniciar? (S/N): ");
            char reiniciar = scanner.next().charAt(0);

            if (reiniciar != 'S' && reiniciar != 's') {
                System.out.println("Programa encerrado.");
                break;
            }

        } while (true);

        scanner.close();
    }
}
