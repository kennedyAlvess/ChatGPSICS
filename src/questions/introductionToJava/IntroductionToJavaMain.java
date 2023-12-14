package questions.introductionToJava;

import java.util.Scanner;

import static menus.Menus.introductionToJavaMenu;
import static menus.Menus.cleanScreen;
import static questions.introductionToJava.Q01.IntroductionToJavaQ1.introductionToJava01;
import static questions.introductionToJava.Q02.IntroductionToJavaQ2.introductionToJava02;
//import static questions.introductionToJava.Q03.IntroductionToJavaQ3.introductionToJava03;
import static questions.introductionToJava.Q04.IntroductionToJavaQ4.introductionToJava04;
import static questions.introductionToJava.Q05.IntroductionToJavaQ5.introductionToJava05;

public class IntroductionToJavaMain {
    
    public static void introductionToJavaMain(){
        Scanner input = new Scanner(System.in);
        int questionChoose;
        do{
            cleanScreen();
            introductionToJavaMenu();
            questionChoose = input.nextInt();
            cleanScreen();
            switch (questionChoose){
                case 1 -> introductionToJava01();
                case 2 -> introductionToJava02();
                case 3 -> {}//introductionToJava03();
                case 4 -> introductionToJava04();
                case 5 -> introductionToJava05();
                case 6 -> System.out.println();
                case 7 -> System.out.println();
                case 8 -> System.out.println();
                case 9 -> System.out.println();
                case 10 -> System.out.println();
                case 11 -> System.out.println();
                case 12 -> System.out.println();
                case 13 -> System.out.println();
                case 14 -> System.out.println();
                case 15 -> System.out.println();
                case 16 -> System.out.println();
                case 17 -> System.out.println();
                case 18 -> System.out.println();
                case 19 -> System.out.println();
                case 20 -> System.out.println();  
                case 21 -> System.out.println();             
                case 22 -> System.out.println();
                case 0 ->{}
                default -> System.out.println("Opção inválida!*");
            }
        }while (questionChoose != 0);
    }
}
