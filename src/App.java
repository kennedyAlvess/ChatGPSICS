import java.util.Scanner;

import static questions.introductionToJava.Q01.introductionToJavaQ1.introductionToJava01;

public class App {
    public static void main(String[] args) {
        int opcao;
        Scanner input = new Scanner(System.in);
        do{
            cleanScreen();
            mainMenu();
            opcao = Integer.parseInt(input.nextLine());
            cleanScreen();
            switch (opcao){
                case 1 -> introductionToJava01();
                case 2 -> System.out.println();
                case 8 -> System.out.println("Saindo...");
                default -> System.out.println("Opção invalida!*");
            }
        }while (opcao != 8 );
        input.close();
    }

    private static void mainMenu(){
        System.out.println("|====================\tSUMÁRIO\t=====================|");
        System.out.println("| 01 - Introdução ao Java                            |");
        System.out.println("| 02 - Criação de classes                            |");
        System.out.println("| 03 - Arrays e ArraysLists                          |");
        System.out.println("| 04 - Reúso de classes                              |");
        System.out.println("| 05 - Abstratas, polimorfismo e interfaces          |");
        System.out.println("| 06 - Coleções genéricas                            |");
        System.out.println("| 07 - Exceções                                      |");
        System.out.println("| 08 - Sair                                          |");
        System.out.println("|====================================================|");
    }

    public static void cleanScreen(){
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
