package questions.introductionToJava.Q08;

import java.util.Scanner;

public class IntroductionToJavaQ8 {
    public static void introductionToJava08() {

        double valor;
        int cod;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do setor referente a compra: ");

        try {
            cod = Integer.parseInt(input.nextLine());
            System.out.println("Qual o valor do produto: ");
            valor = Double.parseDouble(input.nextLine());

            switch (cod) {
                case 222 -> {
                    if (valor > 500) {
                        System.out.println(cod + " - R$ " + (valor - (valor * 0.1)) + " reais.");
                    } else {
                        System.out.println(cod + " - R$ " + valor + " reais.");
                    }
                }
                case 111 -> {
                    if (valor > 100) {
                        System.out.println(cod + " - R$ " + (valor - (valor * 0.4)) + " reais.");
                    } else if (valor < 50) {
                        System.out.println(cod + " - R$ " + (valor - (valor * 0.1)) + " reais.");
                    } else {
                        System.out.println(cod + " - R$ " + (valor - (valor * 0.2)) + " reais.");
                    }
                }
                default -> System.out.println("Setor invalido");
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
