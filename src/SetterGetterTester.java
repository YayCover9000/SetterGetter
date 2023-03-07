import java.util.Scanner;
public class SetterGetterTester {
    public static void main (String [] args) {
        System.out.println("Hiermit können Dates verabredet werden: ");
        SetterGetter laurasVorschlag = new SetterGetter ("Kino", 2015, "Kleid", "Date");
        SetterGetter yassuansVorschlag = new SetterGetter ("Restaurant", 2015, "Hemd", "Date");
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Ort eingeben: ");
        String ort = eingabe.nextLine();
        System.out.println("Bitte Jahr eingeben: ");
        int year = eingabe.nextInt();
        System.out.println("Bitte Kleidung eingeben: ");
        String kleidung = eingabe.nextLine();
        System.out.println("Bitte Anlass eingeben: ");
        String anlass = eingabe.nextLine();
        SetterGetter randomVorschlag = new SetterGetter (ort, year, kleidung, anlass);
        SetterGetter.ausgeben(laurasVorschlag);
        SetterGetter.ausgeben(yassuansVorschlag);
        SetterGetter.ausgeben(randomVorschlag);

    }
}
