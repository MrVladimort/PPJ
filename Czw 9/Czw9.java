public class Czw9 {

	public static void main(String[] args){

		// === 1 ===

		

		int wrt = 2;

		for (int i = 1; i <= 50; i++) {
			System.out.print(i * wrt + "  ");

		}
		System.out.println();
		System.out.println("-----------------------Czw 1-----------------------");

		// === 2 ===

		/* int s = 0;
		 for (int i = 1 ; i <= 10; i++) {
		 s = s + i ;
		 System.out.print(" " + s);
		 }
		 
		 System.out.println();
		 System.out.println("----------------------------------------------");

		*/
		 {
		int i = 1;
		int s = 0;
		do { s = s + i;
			System.out.print(" " + s);
			i++;
		} while (i <= 10);
		}
		
		System.out.println();
		System.out.println("-----------------------Czw 2-----------------------");

		 

		 // === 3 ===

		for(int mul = 1; mul < 11; mul++){
			for(int i = 1; i < 11; i++)
				System.out.print((i * mul)+ " ");
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------------Czw 3-----------------------");


		
		// === 4 ===
		/*
		int a = 100500, b = 0;
		while(b < 10) {
			if(a % 2 != 0 && a % 1 == 0 && a % a == 0 && a%3 != 0 && a%5 != 0 && a%7 !=0 || a == 2 || a == 3 || a == 5 || a == 7){
				System.out.print(a + " ");
				b++;
			}
			a++;
		}
		*/
		
		/*
		int num, arg;
			for(num = 2; num <= 140; num++) {
				for(arg = 2; (num % arg) != 0; arg++) {
				}
					if(arg == num) 
					System.out.print(num + " ");
		}
		*/
		
		int y = 0;
		for (i = 1; i <= 100;i++){
		for(k=1;k < i; k++){
		int z = i % k;
		if(z == 0)
		y++;}
		if(t <= 2)
		System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------Czw 4-----------------------");
		
		
		
		
		
		
		// === 5 ===
		/*
		int w = 2;
		for (int i = 0; i<w; i++) {
			for(int j = 0; j<w - i; j++){
			System.out.print(" ");
			}
			for (int j = 0; j<i*2; j++){
				System.out.print('*');
			}
			System.out.print('*');
			System.out.println(" ");
		}

		
		w = 3;
		for (int i = 0; i<w; i++) {
			for(int j = 0; j<w - i; j++){
				System.out.print(" ");
			}
			for (int j = 0; j<i*2; j++){
				System.out.print('*');
			}
			System.out.print('*');
			System.out.println(" ");
		}
		*/
		 		 
		for (int i = 5; i > 2; i -= 2) { 
			for (int j = 0; j < 9 - i / 2; j++) 
			System.out.print(" ");
				for (int j = 0; j < i; j++) 
				System.out.print("*"); 
				System.out.print("\n"); 
		} 

		for (int i = 1; i < 6; i += 2) { 
			for (int j = 0; j < 9 - i / 2; j++) 
			System.out.print(" "); 
				for (int j = 0; j < i; j++) 
				System.out.print("*"); 
				System.out.print("\n"); 
		}		 
		System.out.println("-----------------------Czw 5-----------------------");
		
				 
				 

}

}