package questions.introductionToJava.Q13;

import java.util.Scanner;

public class IntroductionToJavaQ13 {
    public static void introductionToJava13() {

        Scanner input = new Scanner(System.in);
        int[][] megaSena = new int[6][10];
        int cont = 0;

        try {
            for (int linha = 0; linha < megaSena.length; linha++) {
                for (int coluna = 0; coluna < megaSena[linha].length; coluna++) {
                    cont += 1;
                    megaSena[linha][coluna] = cont;
                    String value = (cont <= 9)? String.format("%02d",cont) : String.valueOf(cont) ;
                    System.out.print("["+value+"]\t");
                }
                System.out.println();
            }

            // for (int[] ints : megaSena) {
            //     for (int anInt : ints) {

            //         if (anInt < 10) {
            //             System.out.print("[0" + anInt + "]\t");
            //         } else {
            //             System.out.print("[" + anInt + "]\t");
            //         }
            //     }
            //     System.out.println();
            // }

        } catch (Exception e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
