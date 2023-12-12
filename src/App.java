import java.util.Scanner;

import static menus.Menus.cleanScreen;
import static menus.Menus.mainMenu;
import static questions.introductionToJava.IntroductionToJavaMain.introductionToJavaMain;

public class App {
    public static void main(String[] args) {
        int listChoose;
        Scanner input = new Scanner(System.in);

        do{
            cleanScreen();
            mainMenu();
            listChoose = Integer.parseInt(input.nextLine());
            cleanScreen();

            switch (listChoose){
                case 1 -> introductionToJavaMain();

                case 2 -> System.out.println();

                case 8 -> System.out.println("Saindo...");

                case 0 -> System.out.println("Saindo...");
                
                default -> System.out.println("Opção inválida!*");
            }
        }while (listChoose != 0 );
        input.close();
    }

  
}
