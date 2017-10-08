public class Czw12 {
	public static void main (String[] args){
		
		//     1
		String[] s = {"Ala", "kota", "ma", "ma", "a", "kot", "Ale"};
		System.out.print(s[0] + " " + s[2] + " " + s[1] + " " + s[4] + " " + s[5] + " " + s[3] + " " + s[6]);
		System.out.println();
		System.out.println("=============Czw1=============");
		
		//       2
		int count = 0;
		char[] t2 = {'A','l','a',' ','m','a',' ','k','o','t','a'};
		for(int i = 0; i<t2.length; i++){
			if (t2[i] == 'a') 
				count++; 
		}
		System.out.println(count);
		System.out.println("=============Czw2=============");
		
		//     3
		int[] taab = new int[20];
		for (int i = 0; i<taab.length; i++){
			taab[i] = (int)(Math.random()*18);
		}
		for (int i = 0; i < taab.length; i++) 
			System.out.print(taab[i] + "  ");
		System.out.println();
		
		for (int i = taab.length-1; i>9; i--){
			taab[i]=taab[i-1];
		}
		taab[9]=-1;
		
		for (int i = 0; i<taab.length; i++){
			System.out.print(taab[i] + "  ");
		}
		System.out.println();
		System.out.println("===========Czw3=============");
		
		//     4
		int[] tab1 = new int[(int)(Math.random()*10)];
		int[] tab2 = new int[(int)(Math.random()*10)];
		int[] tab3 = new int[(int)(Math.random()*10)];
		
		for (int i = 0; i<tab1.length; i++)
		tab1[i]=(int)(Math.random()*10);
		for (int i = 0; i<tab2.length; i++)
			tab2[i]=(int)(Math.random()*10);
		for (int i = 0; i<tab3.length; i++)
			tab3[i]=(int)(Math.random()*10);
		
		int[][] all  = {tab1, tab2, tab3};
		for (int i = 0; i<all.length; i++){
			for (int j = 0; j<all[i].length; j++){
				System.out.print(all[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=============Czw4=============");
		System.out.println();
		
		//      5
		/*
		int[][] tab5 = new int[8][8];
		for (int i = 0; i < tab5.length; i++) {
			for (int j = 0; j < tab5[i].length; j++) {
				tab5[i][j] = (int) (Math.random() * 10);
				System.out.print(tab5[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		boolean liczba = true;
		for (int i = 0; i<tab5.length && liczba; i++){
			int countLP = 0, countPL = 0;
			for(int j = 0; j<tab5[i].length && liczba; j++){
				if(tab5[i][i] == tab5[j][j] || tab5[i][i] == tab5[j][tab5.length-1-j])
					countLP++;
				
				if (tab5[i][tab5.length-1-i] == tab5[j][j] || tab5[i][tab5.length-1-i] == tab5[j][tab5.length-1-j])
					countPL++;

				if (countPL >= 3 || countLP >= 3 || (countLP+countPL) >= 3 && tab5[i][i] == tab5[i][tab5.length-1-i])
					liczba = false;
			}
			System.out.println("countLP "+ countLP);
			System.out.println(tab5[i][i]);
			System.out.println("countPL "+ countPL);
			System.out.println(tab5[i][tab5.length-1-i]);
			System.out.println();
		}
		*/
		
		// 5
		int[][] tab = new int[8][8];
		for (int i = 0; i<tab.length; i++){
			for (int j = 0; j<tab[i].length; j++){
			tab[i][j] = (int)(Math.random()*10);
			System.out.print(tab[i][j] + " ");
			}
		System.out.println();
		}
		
		boolean tmp = true;
		for (int i = 0; i<tab.length && tmp; i++){
		count = 0;
			for (int j = 0; j< tab[i].length && tmp; j++){

				if (tab[i][i] == tab[j][j] || tab[i][i] == tab[j][tab.length-1-j] && i!=j){
				count ++;
				}

				if (tab[i][tab.length-1-i] == tab[j][j] || tab[i][tab.length-1-i] == tab[j][tab.length-1-j] && i!=j){
				count ++;
				}
				if (count == 2){
					System.out.println("TAK");
					tmp = false; 
				}
			}

		}
		System.out.println("=============Czw5=============");
		
	}
}
