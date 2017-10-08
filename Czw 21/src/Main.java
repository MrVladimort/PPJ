public class Main {
    public static void main(String[] args){

        System.out.println("=======Czw 1=======");
        Dzem dzem1 = new Dzem("Loh", 25);
        Dzem dzem2 = new Dzem("TopKek");
        Dzem dzem3 = new Dzem(40);
        dzem1.show();
        System.out.println("==============");
        dzem2.show();
        System.out.println("==============");
        dzem3.show();

        System.out.println("\n" + "=======Czw 2=======");
        System.out.println("\n" + "=======dzem1=======");
        Sloik sloik = new Sloik(dzem1);
        System.out.println("\n" + "=======dzem2=======");
        Sloik sloik1 = new Sloik(dzem2);
        System.out.println("\n" + "=======dzem3=======");
        Sloik sloik2 = new Sloik(dzem3);

        System.out.println("\n" + "=======Czw 3=======");
        Wyraz ala = new Wyraz("Ala");
        ala.setNastepnyWyraz("ma");
        ala.setNastepnyWyraz("kota");
        ala.setNastepnyWyraz("a");
        ala.setNastepnyWyraz("kot");
        ala.setNastepnyWyraz("ma");
        ala.setNastepnyWyraz("Ale");
        ala.show();
    }
}
