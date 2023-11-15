import java.time.LocalDate;
import java.util.Scanner;

public class Calculator extends Telephone {
    public Calculator() {
    }

    public Calculator(String soz, long san, LocalDate localDate, long id) {
        super(soz, san, localDate, id);
    }

    public static void calculator1() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n♥0♥ - Exit!\n" +
                    "♥1♥ - Contain");
            String numm = scanner.nextLine();
            if (numm.equalsIgnoreCase("0")) {
                break;
            } else {
                System.out.println("\nБиринчи санды жаз?  ");

                int num1;
                while (true) {
                    String soz = scanner.nextLine();
                    if (soz.contains("1") || soz.contains("2") || soz.contains("3") || soz.contains("4") || soz.contains("5") || soz.contains("6") || soz.contains("7") || soz.contains("8") || soz.contains("9") || soz.contains("0")) {
                        num1 = Integer.parseInt((soz));
                        break;
                    } else System.out.println("Write number!");
                }
                int num2;
                System.out.println("Экинчи санды жаз? ");
                while (true) {
                    String soz = scanner.nextLine();
                    if (soz.contains("1") || soz.contains("2") || soz.contains("3") || soz.contains("4") || soz.contains("5") || soz.contains("6") || soz.contains("7") || soz.contains("8") || soz.contains("9") || soz.contains("0")) {
                        num2 = Integer.parseInt((soz));
                        break;
                    } else System.out.println("Write number!");
                }
                int res;
                System.out.println("Не кылабыз? ");
                String action = scanner.nextLine();
                if (action.contains("+") || action.contains("-") || action.contains("*") || action.contains("/")) {
                    switch (action) {
                        case "+":
                            res = num1 + num2;
                            System.out.println(" "+
                                    "___________________________\n"+
                                    " |        ___(o)___        |\n"+
                                    " |       Калькулятор       |\n"+
                                    " |          |- +|          |\n"+
                                    " |          |* =|          |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |  "+ num1 + " + " + num2 + " = " + res +             "           |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |_________________________|\n"+
                                    " ");
                            break;
                        case "-":
                            res = num1 - num2;
                            System.out.println(" "+
                                    "___________________________\n"+
                                    " |        ___(o)___        |\n"+
                                    " |       Калькулятор       |\n"+
                                    " |          |- +|          |\n"+
                                    " |          |* =|          |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |  "+ num1 + " - " + num2 + " = " + res +             "           |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |_________________________|\n"+
                                    " ");
                            break;
                        case "*":
                            res = num1 * num2;
                            System.out.println(" "+
                                    "___________________________\n"+
                                    " |        ___(o)___        |\n"+
                                    " |       Калькулятор       |\n"+
                                    " |          |- +|          |\n"+
                                    " |          |* =|          |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |  "+ num1 + " * " + num2 + " = " + res +             "           |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |                         |\n"+
                                    " |_________________________|\n"+
                                    " ");
                            break;
                        case "/":
                            if (num2 < 0) {
                                System.out.print("Болунбойтта е!");
                            } else {
                                res = num1 / num2;
                                System.out.println(" "+
                                        "___________________________\n"+
                                        " |        ___(o)___        |\n"+
                                        " |       Калькулятор       |\n"+
                                        " |          |- +|          |\n"+
                                        " |          |* =|          |\n"+
                                        " |                         |\n"+
                                        " |                         |\n"+
                                        " |  "+ num1 + " / " + num2 + " = " + res +             "           |\n"+
                                        " |                         |\n"+
                                        " |                         |\n"+
                                        " |                         |\n"+
                                        " |                         |\n"+
                                        " |                         |\n"+
                                        " |                         |\n"+
                                        " |                         |\n"+
                                        " |_________________________|\n"+
                                        " ");
                            }
                            break;
                        default:
                            System.out.println("Бир нерсени ката жаздын");
                    }
                }else System.out.println("Арифметикалык операция жазыныз!");
            }
        }
    }
}





