// Klasa bazowa
class Figura {
    protected String kolor;

    public Figura(String kolor) {
        this.kolor = kolor;
    }

    public void rysuj() {
        System.out.println("Rysowanie figury w kolorze: " + kolor);
    }
}

// Klasa dziedzicząca po Figura
class Kolo extends Figura {
    private double promien;

    public Kolo(String kolor, double promien) {
        super(kolor);
        this.promien = promien;
    }

    public double obliczPole() {
        return Math.PI * promien * promien;
    }
}

// Klasa dziedzicząca po Figura
class Prostokat extends Figura {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(String kolor, double dlugosc, double szerokosc) {
        super(kolor);
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double obliczPole() {
        return dlugosc * szerokosc;
    }
}

// Interfejs
interface Rysowalny {
    void rysuj();
}

// Klasa implementująca interfejs Rysowalny
class Linia implements Rysowalny {
    public void rysuj() {
        System.out.println("Rysowanie linii");
    }
}

public class Main {
    public static void main(String[] args) {
        Kolo kolo = new Kolo("Czerwony", 5.0);
        Prostokat prostokat = new Prostokat("Niebieski", 4.0, 6.0);
        Linia linia = new Linia();

        kolo.rysuj();
        System.out.println("Pole koła: " + kolo.obliczPole());

        prostokat.rysuj();
        System.out.println("Pole prostokąta: " + prostokat.obliczPole());

        linia.rysuj();
    }
}
