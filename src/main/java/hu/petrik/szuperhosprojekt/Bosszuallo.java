package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;
    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void addToSzuperero(double szuperero) {
        this.szuperero += szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos.getClass() == Batman.class)
        {
            Batman batman = (Batman) szuperhos;
            return this.szuperero == batman.mekkoraAzEreje() * 2;
        }
        Bosszuallo bosszuallo = (Bosszuallo) szuperhos;
        return (this.szuperero > bosszuallo.mekkoraAzEreje()) && bosszuallo.vanEGyengesege;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public String toString() {
        return "Szupererő: " + String.format("%.0f", szuperero) + "; " + ((vanEGyengesege) ? "van gyengesége" : "nincs gyengesége");
    }
}
