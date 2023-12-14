package questions.introductionToJava.Q09;

import java.util.Scanner;

public class IntroductionToJavaQ9 {
    public static void introductionToJava09(){

        int numDaCarta, naipeDaCarta;
        String[] cartas = {"Ás","Um","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Reis"};
        String[] naipe = {"Ouro","Paus","Copas","Espadas"};
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Informe o número da carta:");
            numDaCarta = Integer.parseInt(input.nextLine());
            System.out.println("Informe o naipe da carta:");
            naipeDaCarta = Integer.parseInt(input.nextLine());

            System.out.println(cartas[numDaCarta-1]+" de "+naipe[naipeDaCarta-1]);
            
        } catch (Exception e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }
}
