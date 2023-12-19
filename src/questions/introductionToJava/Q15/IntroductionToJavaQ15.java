package questions.introductionToJava.Q15;

import java.util.Scanner;

public class IntroductionToJavaQ15 {
    public static void introductionToJava15(){

        Scanner input = new Scanner(System.in);
        int numero = 1, TotalDeNumerosPerfeitos = 0;
        System.out.println("Os 4 primeiros números perfeitos são: ");
        
        try {
            while (TotalDeNumerosPerfeitos != 4) {
                if (somaDosDivisores(numero) == numero) {
                    System.out.println(numero);
                    TotalDeNumerosPerfeitos++;
                }
                numero++;
            }            
        } catch (NumberFormatException e) {
            System.err.println("Valor inválido!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }

    private static int somaDosDivisores(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        return soma;
    }
    
}
