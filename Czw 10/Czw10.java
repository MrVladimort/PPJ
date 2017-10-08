import java.util.Arrays;
import java.util.Collections;

public
	class Czw10 {
		public static void main (String[] args){
			System.out.println("Top Kek");
			
			Integer[] tab = {2, 5, 100, 1000, 2, -2, -78, 256, -5, 0};
			Arrays.sort(tab, Collections.reverseOrder());
			System.out.println(Arrays.toString(tab));
			System.out.println("=================================");
		
			// 1, 2, 3
			Integer[] tab1 = {2, 5, 100, 1000, 2, -2, -78, 256, -5, 0};
			
			int tab2 [] = {
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2),
			(int)(Math.random()*2)
			};
			System.out.println(Arrays.toString(tab2));
			for(int i=0; i < tab2.length; i++ ){
			System.out.println("tab["+i+"]: "+ tab2[i] + " ");
			}
			System.out.println("===============1, 2, 3==================");
			
			// 4
			
			int count = 0;
			int rozmiar = (int) (Math.random() * 100);
			int[] tab4 = new int [rozmiar];
				for (int i = 0; i < tab4.length; i++) {
					count++;
				}
			System.out.println("Rozmiar tablicy: " + count);
			count = 0;
			
			System.out.println("================4=================");
			
			// 5
			
			double [] tab5 = new double [10];
			
			for (int i = 0; i < tab.length; i++) {
				tab5[i] = Math.random()*10; //5.1
				System.out.println(tab5[i]); //5.2
			}
			System.out.println("=================================");
			for (int i = 0; i < tab.length; i++) {

				if (i % 2 == 0) //5.3
					System.out.println(tab5[i]);
				if ((int)tab5[i] % 2 != 0) //5.4
					System.out.println(tab[i]);
			}
			System.out.println("==================5===============");
			// 6 
			
			
			int tab6 [] = {1, 0, 0, 0, 2, 0, 0, 0, 3}; 
			
			for (int i = 0; i<3; i++){
				for(int j = 0; j<3; j++){
					System.out.print(tab6[(i*3)+j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			for (int i = 2; i >= 0; i--){
				for(int j = 0; j<3; j++){
					System.out.print(tab6[(i*3) + j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			for (int i = 8; i > 6; i--){
				for(int j = 0; j < 3; j++){
					System.out.print(tab6[i - j] + " ");
				}
				System.out.println();
			}
			System.out.println("==================6===============");
			
			
			// 7
			
			/*
			 int tab7 [];
			 System.out.println(tab7) 
			*/
			
			// 8
			
			/*
			int tab8 [] = { 789, 678, 567}; 
			for (int i = 0; i < tab8.length; i++) 
				for (int j = i; j < tab8.length; j++) 
			System.out.println(tab8[i] − tab8[j]);
			*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}