package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    public Vasember(double szuperero, boolean vanEGyengesege) {
        super(szuperero, vanEGyengesege);
    }
    public Vasember() {
        this(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return this.getSzuperero() > 1000;
    }

    @Override
    public void kutyutKeszit() {
        Random rand = new Random();
        this.addToSzuperero(rand.nextInt(11));
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
