public class Main {

     public static void main(String[] args) {
     //----z1----
    	System.out.println("------Czw1-------");
        System.out.println("--------B--------");
        B b = new B();
        b.nstaticShowThis();
        B.staticShowThis(b);
     //----z2----
        System.out.println("------Czw2-------");
        Kwadrat kwadrat = new Kwadrat(4);
        kwadrat.Show();
     //----z3----
        System.out.println("------Czw3-------");
        Walec walec = new Walec(2,4);
        walec.Show();
     //----z4----
        System.out.println("------Czw4-------");
        kwadrat.ShowWalec();
     //----z5----
        System.out.println("------Czw5-------");
        Wyraz topkek = new Wyraz();
        topkek.dodajZnak('a');
        topkek.dodajZnak('b');
        topkek.dodajZnak('c');
        topkek.dodajZnak('c');
        System.out.println("------Wyraz------");
        System.out.println("Slowo :" + " " + topkek);
        System.out.println("Kilkist :" + " " + topkek.length());
    }
}
