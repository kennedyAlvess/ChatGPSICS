package questions.introductionToJava.Q11;

import java.util.Scanner;

public class IntroductionToJavaQ11 {
    public static void introductionToJava11() {

        double x1, y1, x2, y2;
        String resposta = "";
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Informe as cordenadas do primeiro ponto: ");
            x1 = Double.parseDouble(input.nextLine());
            y1 = Double.parseDouble(input.nextLine());
            System.out.println("Informe as cordenadas do segundo ponto: ");
            x2 = Double.parseDouble(input.nextLine());
            y2 = Double.parseDouble(input.nextLine());

            if (x2 > x1) {
                resposta += "O segundo ponto está à direita do primeiro ponto.\n";
            } else if (x2 < x1) {
                resposta += "O segundo ponto está à esquerda do primeiro ponto.\n";
            } else {
                resposta += "Os pontos possuem coordenadas X iguais.\n";
            }

            if (y2 > y1) {
                resposta += "O segundo ponto está acima do primeiro ponto.";
            } else if (y2 < y1) {
                resposta += "O segundo ponto está abaixo do primeiro ponto.";
            } else {
                resposta += "Os pontos possuem coordenadas Y iguais.";
            }

            System.out.println(resposta);
        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }

}
