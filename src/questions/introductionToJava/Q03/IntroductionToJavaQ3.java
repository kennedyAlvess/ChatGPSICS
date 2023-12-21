package questions.introductionToJava.Q03;

import java.util.Scanner;

public class IntroductionToJavaQ3 {
    public static void introductionToJava03() {

        double angulo;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um ângulo em graus: ");

        try {
            angulo = Double.parseDouble(input.nextLine());
            double toRadiano = Math.toRadians(angulo);
            double seno = Math.sin(angulo);
            double cos = Math.cos(angulo);
            double tg = Math.tan(angulo);
            double cossec = 1 / seno;
            double sec = 1 / cos;
            double cotg = 1 / tg;

            System.out.println("Ângulo em radianos: " + toRadiano +
                    "\nSeno: " + seno +
                    "\nCosseno: " + cos +
                    "\nTangente: " + tg +
                    "\nCossecante: " + cossec +
                    "\nSecante: " + sec +
                    "\nCotangente: " + cotg);

        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
