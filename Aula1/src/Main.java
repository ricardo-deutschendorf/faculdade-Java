import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Selecione seu operador aritmético\n" +
                        "1. para somar\n" +
                        "2. para diminuir\n" +
                        "3. para multiplicar\n" +
                        "4. para dividir\n"
        );

        int operador = scanner.nextInt();

        if (operador == 1) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Resultado da soma: " + (num1 + num2));

        } else if (operador == 2) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Resultado da subtração: " + (num1 - num2));

        } else if (operador == 3) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Resultado da multiplicação: " + (num1 * num2));

        } else if (operador == 4) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Resultado da divisão: " + (num1 / num2));

        } else {
            System.out.println("Você não selecionou uma opção válida");
        }

        System.out.println("Digite um número para mostrar os próximos 5:");
        int num3 = scanner.nextInt();

        for (int i = num3 + 1; i <= num3 + 5; i++) {
            System.out.println(i);
        }


        scanner.close();
    }
}
