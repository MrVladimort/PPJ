/**
 * Created by Влад on 05.02.2017.
 */
public class Zwierzak {
    private int Waga;
    private int Wiek;
    private String dataWaga;
    private String imie;

    public Zwierzak(String imie,int wiek) {
        this.imie = imie;
        this.Wiek = wiek;
    }

    public void show(){
        System.out.println("Imie: "+ this.imie);
        System.out.println("Wiek: " + this.Wiek);
        System.out.println("Waga: " + this.Waga);
    }
    public void setWaga(int waga) {
        this.Waga = waga;
    }
    public void setWaga(int waga,String s) {
        this.Waga = waga;
        this.dataWaga = s;
    }
    public void incWiek(){
        this.Wiek = this.Wiek + 5;
    }

    public String toString(){
        return "Name: " + this.imie + "\n" + "Wiek: " + this.Wiek + "\n" + "Waga: " + this.Waga;
    }

    public static void main ( String [ ] args ) {
        Zwierzak kot = new Zwierzak (" Mlody ", 5);
        kot.setWaga(10);
        kot.setWaga(10," 10 -12 -2001 ");
        kot.incWiek();
        kot.show();
        Stos.dodanieElementu(kot);
        System.out.println(Stos.sciagniecieElementu());
    }
}

class Stos {
    static private Zwierzak[] stosArray = new Zwierzak[1];
    static private int top = -1;
    public static void dodanieElementu(Zwierzak kot){
        stosArray[++top] = kot;
    }

    public static Zwierzak sciagniecieElementu(){
        return stosArray[top];
    }
}
