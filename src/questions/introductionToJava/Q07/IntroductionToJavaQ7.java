package questions.introductionToJava.Q07;

import java.util.Scanner;

public class IntroductionToJavaQ7 {
    public static void introductionToJava07() {

        double num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe três números: ");

        try {
            num1 = Double.parseDouble(input.nextLine());
            num2 = Double.parseDouble(input.nextLine());
            num3 = Double.parseDouble(input.nextLine());
            System.out.println("O menor número é: " + Math.min(Math.min(num1, num2), num3));
            
        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
