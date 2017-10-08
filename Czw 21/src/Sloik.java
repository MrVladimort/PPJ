public class Sloik {
    private Dzem dzem;
    private boolean czyOtwarty;

    public void otworz(){
        if (!czyOtwarty){
            czyOtwarty = true;
            System.out.println("Otkryvau" + "\n" + "Czy Otwarty:  " + czyOtwarty);}
        else
            System.out.println("Sloik juz otwarty");
    }

    public void zamknij(){
        if (czyOtwarty){
            czyOtwarty = false;
            System.out.println("Zakryvau" + "\n" + "Czy Otwarty:  " + czyOtwarty);}
        else
            System.out.println("Sloik juz zamkniety");
    }

    public Sloik(Dzem dzem){
        this.otworz();

        if (czyOtwarty){
            System.out.println("Nalivau");
            this.dzem = dzem;
            System.out.println("==============");
            dzem.show();
            System.out.println("==============");
            this.zamknij();
        }
        else
            System.out.println("Najpierw otworz sloik");
    }


}
