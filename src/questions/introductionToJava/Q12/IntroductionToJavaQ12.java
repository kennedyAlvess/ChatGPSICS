package questions.introductionToJava.Q12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class IntroductionToJavaQ12 {
    public static void introductionToJava12() {

        int dia;
        Scanner input = new Scanner(System.in);

        try {
            do {
                System.out.println("Informe o dia do mês de fevereiro de 2015:");
                dia = Integer.parseInt(input.nextLine());

                if (dia < 1 || dia > 28) System.out.println("Dia inválido!*");

            } while (dia < 1 || dia > 28);

            obterDiaDaSemana2015(dia);

            /*switch (data) {
                case 1, 8, 15, 22 -> System.out.println("O dia " + data + " será um Domingo");
                case 2, 9, 16, 23 -> System.out.println("O dia " + data + " será uma Segunda-Feira");
                case 3, 10, 17, 24 -> System.out.println("O dia " + data + " será uma Terça-Feira");
                case 4, 11, 18, 25 -> System.out.println("O dia " + data + " será uma Quarta-Feira");
                case 5, 12, 19, 26 -> System.out.println("O dia " + data + " será uma Quinta-Feira");
                case 6, 13, 20, 27 -> System.out.println("O dia " + data + " será uma Sexta-Feira");
                case 7, 14, 21, 28 -> System.out.println("O dia " + data + " será um Sabado");
            }*/
        } catch (NumberFormatException e) {
            System.out.println("Valor Invládio!*");
        } finally {
            System.out.println("\nPrecione enter para retornar ao menu!*");
            input.nextLine();
        }
    }

    private static void obterDiaDaSemana2015(int diaDoMes) {
        String dataString = diaDoMes+"/02/2015";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date data = dateFormat.parse(dataString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);

            int diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);
            String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

            System.out.println(String.valueOf(dateFormat.format(data))+" - "+diasDaSemana[diaDaSemana - 1]);
        } catch (ParseException e) {
            System.out.println("Erro ao tentar converter a data!*");
        }
    }
}
