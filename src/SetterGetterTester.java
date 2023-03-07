import java.util.Scanner;
public class SetterGetterTester {
    public static void main (String [] args) {
        System.out.println("Hiermit können Dates verabredet werden: ");
        SetterGetter laurasVorschlag = new SetterGetter ("Kino", 2015, "Kleid", "Date");
        SetterGetter yassuansVorschlag = new SetterGetter ("Restaurant", 2015, "Hemd", "Date");
        System.out.println("Bitte Ort eingeben: ");
        Scanner eingabe = new Scanner(System.in);
        String ort = eingabe.nextLine();
        System.out.println("Bitte Datum eingeben: ");
        int datum = eingabe.nextInt();
        System.out.println("Bitte Kleidung eingeben: ");
        String kleidung = eingabe.nextLine();
        System.out.println("Bitte Anlass eingeben: ");
        String anlass = eingabe.nextLine();
        SetterGetter randomVorschlag = new SetterGetter (ort, datum, kleidung, anlass);
    }
}
