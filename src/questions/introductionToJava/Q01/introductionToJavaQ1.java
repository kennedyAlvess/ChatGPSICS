package questions.introductionToJava.Q01;

import java.util.Scanner;


public class IntroductionToJavaQ1 {
    public static void introductionToJava01() {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o comprimento do lado do quadrado: ");

        try {
            double comprimentoDoLado = Double.parseDouble(input.nextLine());
            System.out.println("Área do quadrado é: " + Math.pow(comprimentoDoLado, 2));
        } catch (Exception e) {
            System.err.println("Valor inválido!*");
        } finally {
            System.out.println("Precione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
