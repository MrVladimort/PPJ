public
	class Program03 {
		
	public static void main (String[] args){
		
		
		
		//1
		{
			System.out.println ("====Czw 1====");
		byte a = 40, b = 50; 
		byte suma = (byte) (a + b); //8 bit nie vlazit v 32 bit
		System.out.println(suma);
		}
		
		//2
		{
		System.out.println ("====Czw 2=====");
		boolean CzyPada = false;
		if(CzyPada == true) {
		System.out.println ("Pada");
		}else{
		System.out.println ("Nie Pada");
		}
		}
		
		//3
		{
		System.out.println("====Czw 3=====");
		int wrt = -4;
		if (wrt>=-4 && wrt<=-3) {
			System.out.println("ABC");
		}else{
			System.out.println ("Nie nalezy do czesci wspólnej tych zbiorów");
		//System.out.println ( wrt>=-4 && wrt<=-3 ? "ABC" :  "Nie nalezy do czesci wspólnej tych zbiorów");
		//System.out.println ( wrt>-15 && wrt<=-13 ? "AB" : wrt>-5 && wrt<-4 ? "AB" : wrt>=-4 && wrt<=-3 ? "ABC" : wrt>-3 && wrt<0 ? "AC" : wrt>5 && wrt<10 ? "AC" : "Nie nalezy do czesci wspólnej tych zbiorów");
		}
		
		//4
		{
		System.out.println("====Czw 4=====");
		int wrt2 = 4;
		if (wrt2<-15) {
			System.out.println ("B");
		}else{ if(wrt2>-13 && wrt2<-10){
			System.out.println ("A");
		}else{
			System.out.println ("Nie nalezy tylko do jednego z zbiorów albo Nie nalezy do zednego");
		}
			
		//System.out.println (wrt2<-15 ? "B" : wrt2>-13 && wrt2<-10 ? "A" : "Nie nalezy tylko do jednego z zbiorów albo Nie nalezy do zednego");
		}
		
		//5
		{
		System.out.println("====Czw 5====");
		
		double u = 2;
		double e = Math.sqrt((Math.pow (u, 2))) - 2; 
		System.out.println (e);
		
		//6
		
		
		System.out.println("====Czw 6====");
		double x = Math.pow(u, 2);
		double y = Math.sqrt(x) - 2; 
		System.out.println (y);
		
		double wrt3 = y;
		System.out.println ( wrt3==e ? "All working good" : "Something wrong");
		}
	
		//7
		{
		System.out.println("====Czw 7====");
		 int n = 4; 
		 long v = (n * 4) - ++n;
		 if(v < 10){ 
			 System.out.println("Za malo"); 
		}else{ System.out.println("W sam raz");
				System.out.println(v);
			}
		}
		
		//8
		{
		System.out.println("====Czw 8====");
		 boolean m = true, z = true; 
		 int i = 20; 
		 m = (boolean) ((i!= 10) ^ (z = false)); 
		 System.out.println(m + ", " + i + ", " + z);
		}
		
		
		
	}
	}
	}
	}