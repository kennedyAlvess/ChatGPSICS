package questions.introductionToJava.Q14;

import java.util.Scanner;

public class IntroductionToJavaQ14 {
    public static void introductionToJava14() {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Informe um número maior que 0: ");

        try {
            n = Integer.parseInt(input.nextLine());
            System.out.println("Série de Fibonacci até o número " + n + ".");

            for (int i = 1; i <= n; i++) {
                System.out.println(fib(i));
            }

        } catch (NumberFormatException e) {
            System.err.println("Valor inválido!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }

    private static int fib(int numero) {
        return (numero >= 2) ? fib(numero - 1) + fib(numero - 2) : numero;
    }
}
