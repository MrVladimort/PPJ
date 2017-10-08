public
	class Main{

	public static void main(String[] args){
		// logiczne
		boolean zmiennaLogiczna;
		
		// liczbowe calkowite
		byte zmCalkowitaByte;
		zmCalkowitaByte = 10;
		short zmCalkowitaShort;
		int zmCalkowitaInt = 16;
		long zmCalkowitaLong = 1000000;
		
		char chr = 'a';
		{
		// rzeczywiste
			float zmReFloat = 3.14f;
			double zmReDouble = 3.14;
			
			System.out.println(zmCalkowitaByte);
		}
			
		System.out.println("zm przed przypisaniem 15: "+zmCalkowitaByte);
		zmCalkowitaByte = 15;
		System.out.println("zm po przypisaniu 15: "+zmCalkowitaByte);
		
		zmCalkowitaInt = zmCalkowitaByte;
		zmCalkowitaInt = (int) zmCalkowitaLong;
		
		System.out.println(zmCalkowitaInt);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println((char)(chr+1));
		
		System.out.println("========================");
		System.out.println(zmCalkowitaInt);
		System.out.println(zmCalkowitaInt++);
		System.out.println(++zmCalkowitaInt);
		
		int wrt = zmCalkowitaInt++ + 5;
		System.out.println(wrt);
		System.out.println(zmCalkowitaInt);
		
		System.out.println( 5 == 6);
		// < <= > >= != 
		
		System.out.println( "jest "+ (zmCalkowitaByte < zmCalkowitaInt ? 5 < 6? 'a' : 'b' : "false") );
		
		
	}
	
}