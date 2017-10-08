/**
 * Created by Влад on 05.02.2017.
 */
public class MidleEarth {
    public static void main (String [] args){
        Nazgul khamul = new Nazgul ("Khamul", 2251);    // pola name i rok ujawniena
        khamul.incWiek(); // zwieksza wiek na 100

        try{
            khamul.findTheRing(); // metoda podnoszaca wijatek gdy getLocation() zwroci "Pelennor Fields"
        }catch (EowinaFoundExeption ex) {
            khamul.setStatusAlive(false); // zmienia statis nazgula
        }

        khamul.show();// wyswitla wszystkie informacije

        Nazgul ibiden = new Nazgul(khamul);
        ibiden.setName("Ibiden");
        ibiden.show();// wyswitla wszystkie informacije

        System.out.println(khamul.equals(ibiden));// uzyskamy wartosc true wtp
        System.out.println(khamul);// wyswietl stan wszystkich pol
    }

    public static String getLoaction(){
        if (Math.random() > 0.5)
            return "Pelennor Fields";
        else
            return "Rohan";
    }
}

class Nazgul{
    private int wiek;
    private String name;
    boolean status;

    public Nazgul(String name, int wiek){
        this.name = name;
        this.wiek = wiek;
        this.status = true;
    }

    public Nazgul (Nazgul nazgul){
        this.name = nazgul.name;
        this.wiek = nazgul.wiek;
        this.status = true;
    }

    public void incWiek(){
        this.wiek = this.wiek + 100;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStatusAlive(boolean status){
        this.status = status;
    }

    public void findTheRing() throws EowinaFoundExeption{
        if (MidleEarth.getLoaction() == "Pelennor Fields")
            throw new EowinaFoundExeption();
    }

    public void show(){
        System.out.println("Name: " + this.name);
        System.out.println("Wiek: " + this.wiek);
        System.out.println("Status: " + this.status);
        System.out.println("======================");
    }

    public boolean equals(Nazgul nazgul){
        return true;
    }

    public String toString(){
        return "Name: " + this.name + "\n" + "Wiek: " + this.wiek + "\n" + "Status: " + this.status;
    }
}

class EowinaFoundExeption extends Exception{
    public EowinaFoundExeption(){
        super ("Eowina has found");
    }
}