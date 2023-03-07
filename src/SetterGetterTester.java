import java.util.Scanner;
public class SetterGetterTester {
    public static void main (String [] args) {
        System.out.println("Hiermit können Dates verabredet werden: ");
        Treffen laurasVorschlag = new Treffen("Kino", "20.01.2015", "Kleid", "Date");
        Treffen yassuansVorschlag = new Treffen("Restaurant", "03.09.2015", "Hemd", "Opernbesuch");
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Ort eingeben: ");
        String ort = eingabe.nextLine();
        System.out.println("Bitte Datum eingeben: ");
        String year = eingabe.next();
        System.out.println("Bitte Kleidung eingeben: ");
        String kleidung = eingabe.next();
        System.out.println("Bitte Anlass eingeben: ");
        String anlass = eingabe.next();


        Treffen randomVorschlag = new Treffen(ort, year, kleidung, anlass);
        Treffen.ausgeben(laurasVorschlag);
        Treffen.ausgeben(yassuansVorschlag);
        Treffen.ausgeben(randomVorschlag);

    }
}
