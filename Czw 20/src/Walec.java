    public class Walec {
    	double promien , wys;

        public Walec(double promien, double wys){
        this.promien = promien;
        this.wys = wys;
        }

        public void Show(){
        System.out.println("------Walec------");
        System.out.println("Sp : " + (int)(wys + Math.pow(promien, 2) * Math.PI));
        System.out.println("V : " + (int)(Math.pow(promien, 2) * Math.PI * wys));
        }
        
        public double getWys(){
        	return wys;
        }
        
        public double getPromien(){
        	return promien;
        }
}
