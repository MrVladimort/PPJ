import java.util.Arrays;
import java.util.Collections;

public
	class Czw11 {
		
	public static void main(String[] args){
		
		//1
		int[][] tab = new int [4][5];
		for (int i = 0; i<tab.length; i++){
			for(int j = 0; j<tab[i].length; j++){
				tab[i][j] = (int) (Math.random()*100);
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
		
		//2
		int indI=0, indJ=0;
		
		for(int i = 0; i<tab.length; i++){
			for(int j=0; j<tab[i].length; j++){
				if (tab[indI][indJ]>tab[i][j]){
					indI=i;
					indJ=j;
				}
			}
		}
	System.out.println("================1================");
		System.out.println("[" + indI + "]"+ " " + "[" + indJ + "]");
	System.out.println("=================2===============");
		
		//3
		int[][] tab2 = {
		{1,0,0},
		{0,1,0}, 
		{0,0,1}
		};
		
		boolean diag = true;
	
		for(int i = 0; i<tab2.length && diag; i++){
			for(int j= 0; j<tab2[i].length && diag; j++){
				if (i != j && tab2[i][j] != 0)
					diag = false;
			}
		}
		System.out.println("Tablica " + (diag ? "" : "nie ") + "jest diagonalna");
		
		System.out.println("================3================");
		
		//4
		int[][] tab3 = new int [5][5];
		
		for (int i = 0; i<tab3.length; i++){
			for(int j = 0; j<tab3[i].length; j++){
				tab3[i][j] = (int) (Math.random()*10);
				System.out.print(tab3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		for (int i = 0; i<tab3.length; i++){
			int countLP = 0, countPL = 0;
			for(int j = 0; j<tab3[i].length; j++){
				if(tab3[i][i] == tab3[j][j] || tab3[i][i] == tab3[j][tab3.length-1-j])
					countLP++;
				if (tab3[i][tab3.length-1-i] == tab3[j][j] || tab3[i][tab3.length-1-i] == tab3[j][tab3.length-1-j])
					countPL++;
			}
			// countlp>1 -> tab[i][i]
		}
		
		
		System.out.println("=================4===============");
		
		//5
	
	
		
	}
}