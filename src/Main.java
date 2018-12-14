import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Enclosure<Adler> enclosureAdler = new Enclosure<>(new ArrayList<Adler>());
        Enclosure<Bachforelle> enclosureBachforelle = new Enclosure<>(new ArrayList<Bachforelle>());
        Enclosure<Elefant> enclosureElefant = new Enclosure<>(new ArrayList<Elefant>());
        Enclosure<Eule> enclosureEule = new Enclosure<>(new ArrayList<Eule>());
        Enclosure<Karpfen> enclosureKarpfen = new Enclosure<>(new ArrayList<Karpfen>());
        Enclosure<Krokodil> enclosureKrokodil = new Enclosure<>(new ArrayList<Krokodil>());
        Enclosure<Schlange> enclosureSchlange = new Enclosure<>(new ArrayList<Schlange>());
        Enclosure<Tiger> enclosureTiger = new Enclosure<>(new ArrayList<Tiger>());
        Enclosure<Wolf> enclosureWolf = new Enclosure<>(new ArrayList<Wolf>());
        Enclosure<Zebra> enclosureZebra = new Enclosure<>(new ArrayList<Zebra>());

        for (int i = 0; i < 5; i++) {
            enclosureAdler.add(new Adler());
            enclosureBachforelle.add(new Bachforelle());
            enclosureElefant.add(new Elefant());
            enclosureEule.add(new Eule());
            enclosureKarpfen.add(new Karpfen());
            enclosureKrokodil.add(new Krokodil());
            enclosureSchlange.add(new Schlange());
            enclosureTiger.add(new Tiger());
            enclosureWolf.add(new Wolf());
            enclosureZebra.add(new Zebra());
        }


        String sector;
        System.out.println("Willkommen im Zoo!\n");

        do {
            System.out.println(
                    "+------------------+------------------------------------------------------------+\n" +
                            "| Zoo Karte        |                                                 +--------+ |\n" +
                            "+------------------+                             XXXXXXXX            |        | |\n" +
                            "|                                             XXXXXXXXXXXXXXXXXXXXXX +----  I | |\n" +
                            "|  Eingang  +-----------+                   XXXXXXXXXXXXXXXXXXXXXXXXXXX  |  n | |\n" +
                            "|                       v                  XX+--------------------+...XX |  f | |\n" +
                            "|                       XX                XX |                    |....XX|  o | |\n" +
                            "| +--------------+ +---------+           XX..|                    |....XX|  r | |\n" +
                            "| |              | |   Zoo   |           XX..|                    |....XX|  m | |\n" +
                            "| |              | +---------+          XX...|   Raubtiere (Z)    |....XX|  a | |\n" +
                            "| | Reptilien (R)| |    XX   |          XX...|                    |...XX |  t | |\n" +
                            "| |              | +    XX   +        XXX....|                    |..XX+--  i | |\n" +
                            "| |              |   XXXXX           XX......|                    |.XX |    k | |\n" +
                            "| +--------------+XXXX XXX          XXXX.....+--------------------+XX  |      | |\n" +
                            "|              XXX~~~~~~XXXX      XXXXXXXXX................XXXXXXXXX   +------+ |\n" +
                            "|  +--------+XXX~~~~~~~~~~~~XXXXXXX~~~~~XXXXXXXXXXXXXXXXXXXXX+----------------+ |\n" +
                            "|  |        |XX.~~~~~~~~~~~~~~~~~~~~~~~~~~XXX+-------------+X|                | |\n" +
                            "|  |        |XX.~~~~~~~~~~~~~~~~~~~~~~~~~XX+               |X|    Vögel (V)   | |\n" +
                            "|  | Fische |XX.~~~~~~~~~~~~~~~~~~~~~~~XXX+                |X+---            -+ |\n" +
                            "|  |  (F)   | XXXX~~~~~~~~~~~~~~~~~~~~XX+--  Säugetiere (S)|XXX +---+        |  |\n" +
                            "|  |        |    XXXXXXXXXXXXXXXXXXXXXX |                  |  XXXXXX|        |  |\n" +
                            "|  |        |                           |                  |     XXX+--------+  |\n" +
                            "|  +--------+                           +------------------+                    |\n" +
                            "+-------------------------------------------------------------------------------+\n" +
                            "x) Zoo verlassen");
            sector = getSector();


            switch (sector) {
                case "R":
                    switch (getReptil()) {
                        case "1":
                            System.out.println("Anzahl Tiere: " + enclosureKrokodil.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureKrokodil.getList().get(0).setFed(enclosureKrokodil.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureKrokodil.getList().get(0).pet());
                                    break;
                            }
                            break;
                        case "2":
                            System.out.println("Anzahl Tiere: " + enclosureSchlange.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureSchlange.getList().get(0).setFed(enclosureSchlange.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureSchlange.getList().get(0).pet());
                                    break;
                            }
                    }
                    break;
                case "F":
                    switch (getFisch()) {
                        case "1":
                            System.out.println("Anzahl Tiere: " + enclosureBachforelle.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureBachforelle.getList().get(0).setFed(enclosureBachforelle.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureBachforelle.getList().get(0).pet());
                                    break;
                            }
                            break;
                        case "2":
                            System.out.println("Anzahl Tiere: " + enclosureKarpfen.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureKarpfen.getList().get(0).setFed(enclosureKarpfen.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureKarpfen.getList().get(0).pet());
                                    break;
                            }
                    }
                    break;
                case "Z":
                    switch (getRaubtier()) {
                        case "1":
                            System.out.println("Anzahl Tiere: " + enclosureTiger.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureTiger.getList().get(0).setFed(enclosureTiger.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureTiger.getList().get(0).pet());
                                    break;
                            }
                            break;
                        case "2":
                            System.out.println("Anzahl Tiere: " + enclosureWolf.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureWolf.getList().get(0).setFed(enclosureWolf.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureWolf.getList().get(0).pet());
                                    break;
                            }
                    }
                    break;
                case "S":
                    switch (getSaeugetier()) {
                        case "1":
                            System.out.println("Anzahl Tiere: " + enclosureElefant.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureElefant.getList().get(0).setFed(enclosureElefant.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureElefant.getList().get(0).pet());
                                    break;
                            }
                            break;
                        case "2":
                            System.out.println("Anzahl Tiere: " + enclosureZebra.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureZebra.getList().get(0).setFed(enclosureZebra.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureZebra.getList().get(0).pet());
                                    break;
                            }
                    }
                    break;
                case "V":
                    switch (getVogel()) {
                        case "1":
                            System.out.println("Anzahl Tiere: " + enclosureAdler.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureAdler.getList().get(0).setFed(enclosureAdler.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureAdler.getList().get(0).pet());
                                    break;
                            }
                            break;
                        case "2":
                            System.out.println("Anzahl Tiere: " + enclosureEule.getList().size());
                            switch (getAction()) {
                                case "1":
                                    enclosureEule.getList().get(0).setFed(enclosureEule.getList().get(0).feed(getFood()));
                                    break;
                                case "2":
                                    System.out.println(enclosureEule.getList().get(0).pet());
                                    break;
                            }
                    }
                    break;
            }
        } while (!sector.equals("x"));
    }


    public static String getSector() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Ihre Wahl: ");
            choice = scanner.next();
        }
        while (!choice.equals("R") && !choice.equals("F") && !choice.equals("Z") && !choice.equals("S") && !choice.equals("V") && !choice.equals("X"));
        return choice;
    }

    public static String getRaubtier() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("1) Tiger\n2) Wolf");
        do {
            System.out.println("Ihre Wahl: ");
            choice = scanner.next();
        }
        while (!choice.equals("1") && !choice.equals("2"));
        return choice;
    }

    public static String getFisch() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("1) Bachforelle\n2) Karpfen");
        do {
            System.out.println("Ihre Wahl: ");
            choice = scanner.next();
        }
        while (!choice.equals("1") && !choice.equals("2"));
        return choice;
    }

    public static String getReptil() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("1) Krokodil\n2) Schlange");
        do {
            System.out.println("Ihre Wahl: ");
            choice = scanner.next();
        }
        while (!choice.equals("1") && !choice.equals("2"));
        return choice;
    }

    public static String getSaeugetier() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("1) Elefant\n2) Zebra");
        do {
            System.out.println("Ihre Wahl: ");
            choice = scanner.next();
        }
        while (!choice.equals("1") && !choice.equals("2"));
        return choice;
    }

    public static String getVogel() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("1) Adler\n2) Eule");
        do {
            System.out.println("Ihre Wahl: ");
            choice = scanner.next();
        }
        while (!choice.equals("1") && !choice.equals("2"));
        return choice;
    }

    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("1) füttern\n2) streicheln");
        do {
            System.out.println("Ihre Wahl: ");
            choice = scanner.next();
        }
        while (!choice.equals("1") && !choice.equals("2"));
        return choice;
    }

    public static String getFood() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("Futter: ");
        choice = scanner.nextLine();
        return choice;
    }


}
