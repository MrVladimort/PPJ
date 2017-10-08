
public class Kontener {
    Cukierek ladunek;
    double masaladunku;
    int dniPrzydatnosci;

public Kontener(int masaladunku){this.masaladunku = masaladunku;}

public boolean sprawdzPrzydatnosc(int dniPrzydatnosci) {
	System.out.print("Czy przydatne? ");
    if (dniPrzydatnosci >= 1)
        return true;
    else
        return false;
}

public void zaladuj(Cukierek ladunek, int dniPrzydatnosci){
    this.ladunek = ladunek;
    this.dniPrzydatnosci = dniPrzydatnosci;
    double tmp = ladunek.getWaga();
    
    if (tmp > masaladunku)
        System.out.println("Masa cukierek jest wieksza. Niz masa ladunku");
}

public int getDniPrzydatnosci(){
    return dniPrzydatnosci;
}
public Kontener(Kontener kontener){
    this.ladunek = kontener.ladunek;
    this.masaladunku = kontener.masaladunku;
    this.dniPrzydatnosci = kontener.dniPrzydatnosci;
}
public void show(){
    System.out.println("Masa Ladunku: " + masaladunku);
    System.out.println("Dni Przydatnosci: " + dniPrzydatnosci);
    ladunek.show();
    System.out.println(sprawdzPrzydatnosc(dniPrzydatnosci));
    System.out.println("---------------------------------------");
}
}
