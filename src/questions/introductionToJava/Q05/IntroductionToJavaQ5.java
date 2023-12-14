package questions.introductionToJava.Q05;

import java.util.Scanner;

public class IntroductionToJavaQ5 {
    public static void introductionToJava05() {

        int centena, dezena, unidade, numCDU = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número de 3 dígitos: ");
        try {
            do {
                numCDU = Integer.parseInt(input.nextLine());
                if (numCDU < 100 || numCDU > 999) {
                    System.out.println("Número inválido, informe um número com 3 dígitos!*");
                }
            } while (String.valueOf(numCDU).length() != 3);

            centena = numCDU / 100;
            dezena = (numCDU % 100) / 10;
            unidade = (numCDU % 100) % 10;
            System.out.println("Número no formato UCD: " + unidade + centena + dezena);
            
        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
