public
	class Program05 {

	public static void main(String[] args) {



		// === 1 ===
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");

		

		// === 2 ===
		
		int wrt = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * wrt + "  ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");


		
		// === 3 ===
		
		do {
			System.out.println("do-while: " + wrt); // ispolnyaetsya po krainei mere 1 raz
			wrt++;
		} while (wrt < 3);
		
		
		while (wrt < 3) { // morzet byt' ne ispolzovana vovse
			System.out.println("while : " + wrt);
			wrt++;
		}
		System.out.println("----------------------------------------------");
		

		// === 4 ===
		
		double res = 0;
		
		for (int n = 0; n < 11; n++){
			int pov = 1;
			
			if (n > 0)
				for (int j = 0; j < n; j++){
					pov *= 2;
				}
				 res += 1.0/pov;
				 
			System.out.println(res);
		}
		System.out.println("----------------------------------------------");
				
		
		// === 5 ===

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) 
				System.out.print('*');
			
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
		
		
		// === 6 ===
		int x = 0;
		while (x++ > 10) {
		}
		String msg = x > 10 ? "Wieksze niz" : "false";
		System.out.println( msg + "," + x);
		System.out.println("----------------------------------------------");
		


		//=== 7 ===
		int y = 0;
		do
		{
			y++;
			System.out.print(y + " ");

		}
		while(y < 10); 
		System.out.println();
		
		System.out.println("----------------------------------------------");		
		



		//=== 8 ===
		
		boolean wykonaj = true;
		int ser = 15, i = 10;
		do
		{
			i--;
			if(i == 6)
				wykonaj = false;
			ser -= 2;
		}
		while(wykonaj);
		System.out.println(ser);
		System.out.println("----------------------------------------------");
		
		
	}
}