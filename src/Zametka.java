import java.awt.geom.AffineTransform;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Zametka extends Telephone {
    public Zametka() {
    }

    public Zametka(String soz, long san, LocalDate localDate, long id) {
        super(soz, san, localDate, id);
    }

    public static Zametka[] addzametka(Zametka[] zametkas) {
        Zametka zametka = new Zametka();
        Scanner scannerStr = new Scanner(System.in);
        System.out.print("Write text!: ");
        zametka.setSoz(scannerStr.nextLine());
        zametka.setLocalDate(LocalDate.now());
        zametka.setId(GeneratorId.idGenerator());
        Zametka[] newallzametka = Arrays.copyOf(zametkas, zametkas.length + 1);
        newallzametka[zametkas.length] = zametka;
        return newallzametka;
    }
    public static void info(Zametka[] zametkas, long counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(" "+
                    "___________________________\n"+
                    " |        ___(o)___        |\n"+
                    " |         Заметки         |\n"+
                    " |          |▔__▔|         |\n"+
                    " |          |____|         |\n"+
                    " |                         |\n"+
                    " |                         |\n"+
                    " | ♥ "+ (i+1)+" ♥ :" + zametkas[i].getSoz() +"|\n"+
                    " | Data: " + zametkas[i].getLocalDate()+ "|\n"+
                    " |  ♥3♥ -Create zametka    |\n"+
                    " |  ♥4♥ -Delete zametka    |\n"+
                    " |                         |\n"+
                    " |                         |\n"+
                    " |                         |\n"+
                    " |                         |\n"+
                    " |_________________________|\n"+
                    " ");
            System.out.println("Zametka: " + zametkas[i].getSoz() + "| Data : " + zametkas[i].getLocalDate() + "| Id: " + zametkas[i].getId());
        }
    }

    public static Zametka[] createZametka(Zametka[] zametkas) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        System.out.println("Write id");
        long idUSer = scanner.nextLong();
        for (int i = 0; i < zametkas.length; i++) {
            if (zametkas[i].getId() == idUSer) {
                System.out.println("Write text: ");
                String soz = scannerStr.nextLine();
                zametkas[i].setSoz(soz);
            } else System.out.println("Mindai id jok!");
        }
        return zametkas;
    }

    public static Zametka[] deleteZametka(Zametka[] zametkas) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        System.out.println("Write id");
        long idUSer = scanner.nextLong();
        for (int i = 0; i < zametkas.length; i++) {
            if (zametkas[i].getId() == idUSer) {
                for (int j = i; j < zametkas.length - 1; j++) {
                    zametkas[j] = zametkas[j + 1];
                }
            }
        }
        return Arrays.copyOf(zametkas, zametkas.length - 1);
    }
}
