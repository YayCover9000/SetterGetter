public class SetterGetter {
    private String treffenOrt;
    private int treffenDatum;
    private String treffenKleidung;
    private String treffenAnlass;

    public SetterGetter (String ort, int datum, String kleidung, String anlass) {
        this.treffenOrt = ort;
        this.treffenDatum = datum;
        this.treffenKleidung = kleidung;
        this.treffenAnlass = anlass;
    }

    public String getTreffenOrt () {
        return treffenOrt;
    }
    public int getTreffenDatum () {
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
    public void setTreffenDatum (int datum) {
        treffenDatum = datum;
    }
    public void setTreffenKleidung(String kleidung) {
        treffenKleidung = kleidung;
    }
    public void setTreffenAnlass (String anlass) {
        treffenAnlass = anlass;
    }
}
