import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel=("Michal");
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
       BigDecimal value = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
         value = value.add(BigDecimal.valueOf(0.1));


        }
        System.out.println(value);

    }

    public static void ukol6() {
       BigDecimal cena = BigDecimal.ZERO;
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 222;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 50;
        System.out.println("Velikost košile je:"+velikostKosile+".");
    }

    public static void ukol9(){
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();


        String name = "Michal Antonín";
               System.out.println("Jméno prodejce je: "+name+".");

        String birth = "4. prosince 1970";
               System.out.println("Datum narození prodejce je: "+birth+".");

        int Pocetsmluv = 9;
               System.out.println("Počet dosud sjednaných smluv je: "+Pocetsmluv+".");

        int Celkovemnozstvi = 100;
               System.out.println("Celkové množství prodané mrkve je: "+Celkovemnozstvi+".");

        String town = "Havlíčkův Brod";
               System.out.println("Název města, kde prodejce sídlí je: "+town+".");

        String spz = "88H34215";
               System.out.println("Registrační značka vozidla je: "+spz+".");

        double spotreba = 8.8;
               System.out.println("Spotřeba firemního vozidla je:"+spotreba+".");

        String IPadress = "152.138.26.0/155.235.222.0";
               System.out.println("IP adress je: "+IPadress+".");


    }
}


