package questions.introductionToJava.Q02;

import java.util.Scanner;

public class IntroductionToJavaQ2 {
    public static void introductionToJava02() {

        Scanner input = new Scanner(System.in);
        double num, soma = 0;

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Informe o " + (i + 1) + "º número: ");
                num = Double.parseDouble(input.nextLine());
                soma += num;
            }
            System.out.println("A soma e média atitmética dos três números informados é:\nSOMA: " + soma + "\nMÉDIA: " + soma / 3);
        } catch (Exception e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("Precione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
