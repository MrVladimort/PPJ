public
	class Main{

	public static void main(String[] args){
		final int czerwony = 1;
		final int niebieski = 2;
		final int zielony = 4;
		
		int wrt;
		
		do{
			wrt = (int)(Math.random() * 8);
			System.out.println("Wylosowano: "+wrt);
			
			switch(wrt){
				case czerwony:
					System.out.println("czerwony");
					break;
					
				case czerwony + zielony:
					System.out.println("zolty");
					break;
					
				case niebieski:
					System.out.println("niebieski");
					break;
					
				case niebieski | czerwony:
					System.out.println("magenta");
					System.out.println("magenta");
					System.out.println("magenta");
					System.out.println("magenta");
					break;
					
				case zielony:
					System.out.println("zielony");
					break;	
					
				default:
					System.out.println("nie kolor");
					break;
			}
		}while(wrt != 3);
		
		
		
		/*
		if(wrt == czerwony)
			System.out.println("czerwony");
		else
			if(wrt == niebieski)
				System.out.println("niebieski");
			else
				if(wrt == zielony)
					System.out.println("zielony");
				else
					System.out.println("nie kolor");
		*/
		
		// =======================================================================
		
		//while(true)
		//	;
	
	/*
		int mul = 1;
		for(int i = 0; i < 10; i++)
			System.out.print((i * mul)+" ");
		System.out.println();
		mul = 2;
		for(int i = 0; i < 10; i++)
			System.out.print((i * mul)+" ");
		System.out.println();
	*/
	
	/*
		for(int mul = 1; mul < 11; mul++){
			for(int i = 1; i < 11; i++)
				System.out.print((i * mul)+" ");
			System.out.println();			
		}
	*/
		try{
			int liczba = System.in.read();
			while( (liczba >= '0' && liczba <= '9') || (liczba < '0')){
				System.out.println("TU:"+liczba);
				liczba = System.in.read();
			}
			/*
			for( ; liczba < 10; ){
				System.out.println("TU");
				liczba = System.in.read();
			}
			*/
		}catch(Exception ex){
			
		}
	
	}
	
}