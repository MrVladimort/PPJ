
public class Magazyn implements MyMagazynInt {

    Kontener tab[];
    int size;

    public Magazyn(){
        tab = new Kontener[5];
        size = 0;
    }

    public void przyjmijKontener(Kontener k) throws MyMagazynFullEx {
	
	    if (size < tab.length) {
	    	int tmp = k.getDniPrzydatnosci();
	    
	    	if(size > 0)
	    		tmp = tab[size-1].getDniPrzydatnosci();
	  
	    	int next = k.getDniPrzydatnosci();
	    
	    	if (tmp >= next) {
	    		tab[size] = k;
	    		size += 1;
	    	}else{
		        int bot = 0;
		        for(int i = 0; i<size; i++){
		            if (tab[i].getDniPrzydatnosci() >= next)
		            	bot = i;
		        }
		        for (int i = size; i>bot; i--){
		            tab[i] = new Kontener(tab[i-1]);
		        }
		        tab[bot] = new Kontener(k);
		        size += 1;
		    }
	    	
	    } else {
	    throw new MyMagazynFullEx();
	    }
    }


    public Kontener wydajKontener() throws MyMagazynEmptyEx {
            if( size > 0){
                size -= 1;
                Kontener tmp = tab[size];
                return tmp;
            } else
                throw new MyMagazynEmptyEx();
        }
    
    public void show(){
        for (int i = 0; i<size; i++) {
            tab[i].show();
        }
    }

}



