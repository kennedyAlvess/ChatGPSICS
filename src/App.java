import java.util.Scanner;

import static menus.MainMenu.mainMenu;
import static questions.introductionToJava.Q01.IntroductionToJavaQ1.introductionToJava01;
import static menus.IntroductionToJavaMenu.introductionToJavaMenu;

public class App {
    public static void main(String[] args) {
        int listChoose, questionChoose;
        Scanner input = new Scanner(System.in);

        do{
            cleanScreen();
            mainMenu();
            listChoose = Integer.parseInt(input.nextLine());
            cleanScreen();

            switch (listChoose){
                case 1 -> {
                    cleanScreen();
                    introductionToJavaMenu();
                    questionChoose= Integer.parseInt(input.nextLine());
                    cleanScreen();

                    switch (questionChoose) {
                        case 1 -> introductionToJava01();
                        case 0 ->{}
                        default-> System.out.println("Opção inválida!*");
                    }
                }

                case 2 -> System.out.println();

                case 8 -> System.out.println("Saindo...");
                
                default -> System.out.println("Opção inválida!*");
            }
        }while (listChoose != 8 );
        input.close();
    }

    private static void cleanScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.err.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }
}
