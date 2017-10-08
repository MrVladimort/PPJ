public class Rakieta {
    private double  predkosc;
    private double OdlegloscOdZiemi;

    public Rakieta(double predkosc, double OdlegloscOdZiemi){
        this.predkosc = predkosc;
        this.OdlegloscOdZiemi = OdlegloscOdZiemi;
    }

    boolean czyWyladuje() throws RakietaException {
        if (predkosc > 20 && OdlegloscOdZiemi < 2) {
            System.out.print("\n" + "Wyladuje: ");
            return true;
        }else{ throw new RakietaException();}
    }
}