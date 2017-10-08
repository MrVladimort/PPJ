public class Magazyn {
	
    private Kontener kontener;
    private int ilosc;
    private int rozmiarMagazynu;
    private Magazyn nastepny;
    private Magazyn glowny;
    
    public Magazyn(){
        ilosc = 0;
        rozmiarMagazynu = 5;
    }
    
    public Magazyn(Kontener kontener){
        this.kontener = new Kontener(kontener);
    }
    
    public void przyjmijKontener(Kontener kontener) throws MagazynPelny{
        if (ilosc >= rozmiarMagazynu){
            throw new MagazynPelny();
        }else{
            int zmiennaRozmiar = 1;
            if (glowny == null) {
                this.kontener = kontener;
                glowny = this;
                ilosc++;
            }else{
            	Magazyn zmienna = glowny;
                while (zmienna.nastepny != null && zmiennaRozmiar < ilosc) {
                	zmienna = zmienna.nastepny;
                	zmiennaRozmiar++;
                }
                zmienna.nastepny = new Magazyn(kontener);
                ilosc++;
            }
        }
    }
    
    public Kontener wydajKontener() throws MagazynPusty {
        if (ilosc <= 0){
            throw new MagazynPusty();
        }else{
        	Magazyn zmienna = glowny;
            int zmiennaRozmiar = 1;
            while (zmienna.nastepny != null && zmiennaRozmiar < ilosc) {
            	zmienna = zmienna.nastepny;
            	zmiennaRozmiar++;
            }
            ilosc--;
            return zmienna.kontener;}
    }
    
    public void show(){
    	Magazyn zmienna = glowny;
        int zmiennaRozmiar = 1;
        while(zmienna.nastepny != null && zmiennaRozmiar < ilosc) {
        	zmienna.kontener.show();
        	zmienna = zmienna.nastepny;
        	zmiennaRozmiar++;
        }
        if (ilosc !=0) zmienna.kontener.show();
        	System.out.println("Kontenerow w magazynie: " + ilosc);
    }
}