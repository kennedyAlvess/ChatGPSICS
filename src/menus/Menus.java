package menus;

public class Menus {
    public static void mainMenu(){
        System.out.println("|=====================  SUMÁRIO  =====================|");
        System.out.println("| 01 - Introdução ao Java                             |");
        System.out.println("| 02 - Criação de classes                             |");
        System.out.println("| 03 - Arrays e ArraysLists                           |");
        System.out.println("| 04 - Reúso de classes                               |");
        System.out.println("| 05 - Abstratas, polimorfismo e interfaces           |");
        System.out.println("| 06 - Coleções genéricas                             |");
        System.out.println("| 07 - Exceções                                       |");
        System.out.println("| 00 - Sair                                           |");
        System.out.println("|=====================================================|");
    }

    public static void introductionToJavaMenu(){
        System.out.println("|===== QUESTÕES =====|\n|--------------------|");
        for (int i = 1; i <= 22 ; i++) {
            String question = (i <= 9)? String.format("%02d",i) : String.valueOf(i) ;
            System.out.println("| "+question+" - QUESTÃO "+question+"    |");
        }
        System.out.println("|--------------------|\n| 00 - VOLTAR        |");
        System.out.println("|====================|");
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
