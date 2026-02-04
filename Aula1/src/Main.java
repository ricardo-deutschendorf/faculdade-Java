import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione seu operador aritimético \n" +
                "1. para somar \n" +
                "2. para diminuir \n" +
                "3. para multiplicar \n" +
                "4. para dividir \n");
        int operador = scanner.nextInt();

        if (operador == 1) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 + num2;
            System.out.println("Resultado da soma: " + resultado);
        }
        if (operador == 2) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 - num2;
            System.out.println("Resultado da subtração: " + resultado);
        }
        if (operador == 3) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 * num2;
            System.out.println("Resultado da multiplicação: " + resultado);
        }
        if (operador == 4) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        }
    }
}