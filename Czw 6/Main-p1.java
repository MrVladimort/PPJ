public
	class Main{
	
	public static void main(String[] args){
		System.out.println(10);
		
		System.out.println(3.14);
		
		System.out.println('a');
		
		// deklaracja zmiennej
		// typ nazwa;
		
		boolean zmLogiczna;
		
		// inicjacja zmiennej
		zmLogiczna = true;
		System.out.println(zmLogiczna);
		zmLogiczna = !zmLogiczna;
		System.out.println(zmLogiczna);
		
			// typ calkowite
			byte zmCalByte = 10;
			short zmCalShort;
			int zmCalInt;
			long zmCalLong;
		
		char chr = 'a';
		
		System.out.println('test');
		
		System.out.println(zmCalByte);
		
		// typ reczywiste
		float zmReFloat = 3.14f;
		double zmReDouble = 3.14;
		
		zmReFloat = (float)zmReDouble;
		
		System.out.println(zmReDouble);
		
		System.out.println(chr+" -> "+(int)chr);
		System.out.println((char)(chr+1)+" -> "+(int)(chr+1));
		
		zmCalInt = 100;
		//System.out.println(zmCalInt += 100);
		System.out.println(zmCalInt += 100);
		System.out.println(zmCalInt);
		
		System.out.println(zmCalInt++ + 5);
		System.out.println(++zmCalInt);
		
		System.out.println( (6 + 7) * 5 );
		
		System.out.println( 6 < 8 );
		// < <= >= > == !=
		
		System.out.println( "jest " + (
			6 > 9 ? 
				(zmCalInt < 0 ? "a" : "b") : 
				"false")
		);
		
	}
	
}