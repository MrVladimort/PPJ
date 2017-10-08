
public class PPJ21 {
    public static void main(String[] args){


        Kontener kontener1 = new Kontener(8);
        kontener1.zaladuj(Fabryka.make(1), 3);
    
        Kontener kontener2 = new Kontener(10);
        kontener2.zaladuj(Fabryka.make(2), 5);
        
        Kontener kontener3 = new Kontener(10);
        kontener3.zaladuj(Fabryka.make(0), 2);
        
        Kontener kontener4 = new Kontener(10);
        kontener4.zaladuj(Fabryka.make(1), 1);
        
        Kontener kontener5 = new Kontener(10);
        kontener5.zaladuj(Fabryka.make(1), 0);
        
        
        
        Magazyn magazyn = new Magazyn();
        
        try{
            magazyn.przyjmijKontener(kontener1);
            magazyn.przyjmijKontener(kontener2);
            magazyn.przyjmijKontener(kontener3);  
            magazyn.przyjmijKontener(kontener4); 
            magazyn.przyjmijKontener(kontener5); 
            
        } catch (MyMagazynFullEx ex){

            System.out.println(ex);
        }
        
        magazyn.show();
        System.out.println("=============================================");
        
        try{
            magazyn.wydajKontener();
        } catch (MyMagazynEmptyEx ex){

            System.out.println(ex);
        }

        magazyn.show();
      
        
    }
}
