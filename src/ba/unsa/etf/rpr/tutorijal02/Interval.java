package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetna, krajnja;
    private boolean pripadnostP, pripadnostK;

    public Interval(double pocetna, double krajnja, boolean pripadnostP, boolean pripadnostK) {
        if(pocetna>krajnja) throw  new IllegalArgumentException("Pocetna veca od krajnje!");
        this.pocetna = pocetna;
        this.krajnja = krajnja;
        this.pripadnostP = pripadnostP;
        this.pripadnostK = pripadnostK;
    }

    public Interval() {
        pocetna = 0;
        krajnja = 0;
        pripadnostK = false;
        pripadnostP = false;
    }

    @Override
    public String toString() {
        String rezultat = "";
        if(pripadnostP) rezultat += "[";
        else rezultat += "(";
        rezultat += pocetna;
        rezultat += ",";
        rezultat += krajnja;
        if(pripadnostK) rezultat += "]";
        else rezultat += ")";

        return rezultat;
    }

    public boolean isIn(double v) {
        if(v >= pocetna && v <= krajnja) return true;
        return false;
    }

    public boolean isNull() {
        if(pocetna == krajnja) return true;
        return false;
    }

    public Interval intersect(Interval interval) {
        return null;
    }

    public static Interval intersect(Interval interval1, Interval interval2) {
        return null;

    }
}
