import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        User[] user = new User[0];
        Zametka[] allzametkas = new Zametka[0];
        long counter = 0;
        Gli:
        while (true) {
            System.out.println("Samsung");
            String onOff = scannerStr.nextLine();
            if (onOff.equalsIgnoreCase("On")) {
                System.out.println("Welcome my Telephone: ");
                DD:
                while (true) {
                    System.out.println(" "+
                           "___________________________\n"+
                           " |        ___(o)___        |\n"+
                          " |    |- +|        |▔__▔|  | \n" +
                          " |    |* =|        |____|  |\n"+
                          " | Калькулятор     Заметки |\n"+
                          " |    ♥ 1 ♥        ♥ 2 ♥   |\n"+
                          " |                         |\n"+
                          " |    |↘.↙|                |\n"+
                          " |    |   |                |\n"+
                          " |    MBank                |\n"+
                          " |    ♥ 3 ♥                |\n"+
                          " |                         |\n"+
                          " |                         |\n"+
                          " |                         |\n"+
                           " |                         |\n"+
                           " |_________________________|\n"+
                            " ");
                    System.out.println("Write number: ");
                    String action = scannerStr.nextLine();
                    switch (action) {
                        case "1": {
                            Calculator.calculator1();
                            break;
                        }
                        case "2": {
                            while (true) {
                                System.out.println(" "+
                                        "___________________________\n"+
                                        " |         Заметки         |\n"+
                                        " |          |▔__▔|         |\n"+
                                        " |          |____|         |\n"+
                                        " |  ♥1♥ -add zametka       |\n"+
                                        " |  ♥2♥ -Get all notes     |\n"+
                                        " |  ♥3♥ -Create zametka    |\n"+
                                        " |  ♥4♥ -Delete zametka    |\n"+
                                        " |_________________________|");
                                System.out.println("♥ 0 ♥- break");
                                String actionMain = scannerStr.nextLine();
                                if (actionMain.equalsIgnoreCase("1")) {
                                    allzametkas = Zametka.addzametka(allzametkas);
                                    counter++;
                                    Zametka.info(allzametkas, counter);
                                } else if (actionMain.equalsIgnoreCase("0")) {
                                    break;
                                } else if (actionMain.equalsIgnoreCase("3")) {
                                    Zametka.createZametka(allzametkas);
                                    Zametka.info(allzametkas, counter);
                                } else if (actionMain.equalsIgnoreCase("4")) {
                                    allzametkas = Zametka.deleteZametka(allzametkas);
                                    counter--;
                                    Zametka.info(allzametkas, counter);
                                } else if (actionMain.equalsIgnoreCase("2")) {
                                    Zametka.info(allzametkas, counter);
                                }
                            }
                            break;
                        }
                        case "3": {
                            Mbank.mBank();
                            break;
                        }
                        case "0":{
                            break DD;

                        }
                    }
                }
            } else if (onOff.equalsIgnoreCase("off")) {
                break Gli;

            }else System.out.println("ON||Off");
        }


    }
}
