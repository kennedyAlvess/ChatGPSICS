package questions.introductionToJava.Q04;

import java.util.Scanner;

public class IntroductionToJavaQ4 {
    public static void introductionToJava04() {

        Scanner input = new Scanner(System.in);
        double temp;
        System.out.println("Temperatura em graus centígrados: ");

        try {
            temp = Double.parseDouble(input.nextLine());
            System.out.println("A temperatura em graus Fahrenheit: " + (temp * 1.8 + 32) + " ºF");
        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
