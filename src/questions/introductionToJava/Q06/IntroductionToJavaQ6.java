package questions.introductionToJava.Q06;

import java.util.Scanner;

public class IntroductionToJavaQ6 {
    public static void introductionToJava06() {

        int numMinutos, totalDias, totalHoras, totalMinutos;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor em minutos: ");

        try {
            numMinutos = Integer.parseInt(input.nextLine());
            totalDias = numMinutos / 1440;
            totalHoras = (numMinutos % 1440) / 60;
            totalMinutos = (numMinutos % 1440) % 60;
            System.out.println(numMinutos + " minutos = " + totalDias + " dias, " + totalHoras + " horas e "
                    + totalMinutos + " minutos.");

        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
