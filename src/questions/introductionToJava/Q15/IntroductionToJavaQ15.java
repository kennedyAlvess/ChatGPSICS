package questions.introductionToJava.Q15;

import java.util.Scanner;

public class IntroductionToJavaQ15 {
    public static void introductionToJava15(){

        int cont = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Os quatros primeiros números perfeitos são: ");
        
        try {
            for (int i = 1; cont != 4; i++) {
                if (calcNum(i) == i){
                    System.out.println(i);
                    cont ++;
                }
            }
        }finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }

    private static int calcNum(int numero){
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero%i == 0) soma += i;
        }
        return soma;
    }
    
}
