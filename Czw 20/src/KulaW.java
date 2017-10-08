public class KulaW {
	private double kulaW; 
	
	public KulaW(Kwadrat k){
		this.kulaW = k.getBok()/2;
	}
	
	public KulaW(Walec w){
		if(w.getPromien()*2 < w.getWys())
			this.kulaW = w.getPromien();
		else
			this.kulaW = w.getWys()/2.0;
	}

}
