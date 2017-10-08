public class Kwadrat {
        float bok;

        public Kwadrat(float bok){
        this.bok = bok;
        }

        public void Show (){
	         System.out.println(("-----Kwadrat-----"));
	         System.out.println("a kwadrat: " + bok);
	         System.out.println("S kwadrat: " + (int)(Math.pow(bok,2)));
	         System.out.println("V kwadrat: " + (int)(Math.pow(bok,3)));
         
        }
        
        
        public void ShowWalec(){
        	Show ();
        	
        	System.out.println("===========================");
        	
        	Walec walec2 = new Walec(bok/2, bok);
        	walec2.Show();
 	        System.out.println("S walec: " + (int)(Math.PI*Math.pow(bok/2, 2)));
 	        System.out.println("V walec: " + (int)(Math.PI*Math.pow(bok/2, 2)*bok));
        }
       


}
