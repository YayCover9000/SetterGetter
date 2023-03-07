public class Treffen {
    private String treffenOrt;
    private String treffenDatum;
    private String treffenKleidung;
    private String treffenAnlass;

    public Treffen(String ort, String year, String kleidung, String anlass) {
        this.treffenOrt = ort;
        this.treffenDatum = year;
        this.treffenKleidung = kleidung;
        this.treffenAnlass = anlass;
    }

    public String getTreffenOrt () {
        return treffenOrt;
    }
    public String getTreffenDatum () {
        return treffenDatum;
    }
    public String getTreffenKleidung () {
        return treffenKleidung;
    }
    public String getTreffenAnlass () {
        return treffenAnlass;
    }

    public void setTreffenOrt (String ort) {
        treffenOrt = ort;
    }
    public void setTreffenDatum (String year) {
        treffenDatum = year;
    }
    public void setTreffenKleidung(String kleidung) {
        treffenKleidung = kleidung;
    }
    public void setTreffenAnlass (String anlass) {
        treffenAnlass = anlass;
    }
    public static void ausgeben (Treffen vorschlag) {
        System.out.println("Treffen: " + vorschlag.getTreffenOrt() + " am " + vorschlag.getTreffenDatum() + " in " + vorschlag.getTreffenKleidung() + " für " + vorschlag.getTreffenAnlass());
    }
}
