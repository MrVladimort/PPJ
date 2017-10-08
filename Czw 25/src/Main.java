public class Main {
    public static void main(String [] args){
    	
    	///1, 3
    	
    	Kontener kontener1 = new Kontener(8);
        kontener1.zaladuj(Fabryka.make(1), 3);

        Kontener kontener2 = new Kontener(9);
        kontener2.zaladuj(Fabryka.make(2), 5);

        Kontener kontener3 = new Kontener(10);
        kontener3.zaladuj(Fabryka.make(0), 2);

        Kontener kontener4 = new Kontener(11);
        kontener4.zaladuj(Fabryka.make(1), 1);

        Kontener kontener5 = new Kontener(13);
        kontener5.zaladuj(Fabryka.make(1), 0);
    
        Kontener kontener6 = new Kontener(14);
        kontener5.zaladuj(Fabryka.make(1), 0);
        
    	Magazyn magazyn = new Magazyn();
    	
    	
    	
  
    	
    	try{
          magazyn.przyjmijKontener(kontener1);
          magazyn.przyjmijKontener(kontener2);
          magazyn.przyjmijKontener(kontener3);
          magazyn.przyjmijKontener(kontener4);
          magazyn.przyjmijKontener(kontener5);
		}catch (MagazynPelny ex){
			System.out.println(ex);
			}
    	
    	try{
      		 magazyn.wydajKontener();
      	 	}catch (MagazynPusty ex){
      		 System.out.println(ex);
      	 	}
     
    	 
    	magazyn.show();
   
  
    	

    	///2
    	System.out.println("================================================================================");
    	
        try {
        Rakieta rakieta = new Rakieta(19, 4);
        System.out.println(rakieta.czyWyladuje());
        } catch (RakietaException ex) {
            System.out.println(ex);
        }

        try {
            Rakieta rakieta = new Rakieta(21, 1.5);
            System.out.println(rakieta.czyWyladuje());
        } catch (RakietaException ex) {
            System.out.println(ex);
        }
    }
}
