package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos {
    private float lelemenyesseg;
    public Batman(float lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;
    }
    public Batman() {
        this(100);
    }

    public void addToLelemenyesseg(float lelemenyesseg) {
        this.lelemenyesseg += lelemenyesseg;
    }

    @Override
    public void kutyutKeszit() {
        this.addToLelemenyesseg(50);
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < this.lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return "Batman: leleményesség: " + String.format("%.0f", lelemenyesseg);
    }
}
