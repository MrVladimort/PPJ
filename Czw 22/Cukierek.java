package c22.g12;

public 
class Cukierek {

	private String smak;
	private double waga;
	
	public Cukierek(String smak, double waga){
		this.smak = smak;
		this.waga = waga;
		
		show();
	}
	
	public void show(){
		System.out.println("Cukierek\n\tsmak: "+smak+"\n\twaga: "+waga);
	}
}
