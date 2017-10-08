import java.util.Arrays;

public class Czw14 {

    public static void main(String[] args){
		
		int [][] tab = new int [10][10];
		
		for (int j = 0; j<tab.length; j++){
			for (int i = 0; i<tab[j].length; i++){
				tab[j][i] = (int)(Math.random()*10);
				System.out.print(tab[j][i] + " ");
			}
			System.out.println();
		}
		// zapolnil
		
		for (int k=0; k < tab.length; k++){
			int [] data = tab[k];
			for(int i=0; i < data.length - 1; i++){
			// znajdz maxIndex
			int maxValIndex1 = i;
				for(int j = i+1; j < data.length; j++){
					if(data[maxValIndex1] < data[j])
						maxValIndex1 = j;
				}
				// zamien
					{
						int tmp = data[i];
						data[i] = data[maxValIndex1];
						data[maxValIndex1] = tmp;
					}
			}
		}
		
		
		System.out.println("======================");
		for (int j = 0; j<tab.length; j++){
			for (int i = 0; i<tab[j].length; i++){
				System.out.print(tab[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("======================");
		System.out.println();
		
		
		
		//-------------------------------2---------------------------
		char [][] tab2 = { 
		{'o','-','-','-','-','-','-','-','-','-'}, 
		{'x','x','x','x','x','x','x','x','x','-'}, 
		{'-','-','-','-','-','-','-','-','x','-'}, 
		{'-','x','x','x','x','x','x','-','x','-'}, 
		{'-','x','e','-','-','-','-','-','x','-'}, 
		{'-','x','x','x','x','x','x','x','x','-'}, 
		{'-','-','-','-','-','-','-','-','-','-'} 
		}; 
		
		int pozycjaX = 0, pozycjaY = 0;
		
		int[][] kierunek = {
			{0,1},
			{0, -1},
			{1, 0},
			{-1, 0}
		};
		
		int [] currentKier = kierunek[0];
		
		while (tab2[pozycjaY][pozycjaX] != 'e'){
			tab2[pozycjaY][pozycjaX] = 'x';
			
			if(
				!(pozycjaY+currentKier[0] < tab2.length
				&& pozycjaY+currentKier[0] >= 0
				&& pozycjaX+currentKier[1] < tab2[0].length
				&& pozycjaX+currentKier[1] >= 0
				&& tab2[pozycjaY+currentKier[0]][pozycjaX+currentKier[1]] != 'x'
				)
			){
				//szukaj nowego kierunku
				for (int i = 0; i < kierunek.length; i++){
					if(
						pozycjaY+kierunek[i][0] < tab2.length
						&& pozycjaY+kierunek[i][0] >= 0
						&& pozycjaX+kierunek[i][1] < tab2[0].length
						&& pozycjaX+kierunek[i][1] >= 0
						&& tab2[pozycjaY+kierunek[i][0]][pozycjaX+kierunek[i][1]] != 'x'
					){
						currentKier = kierunek[i];
						i = kierunek.length;
					}
				}
			}
			
			for (int j = 0; j<tab2.length; j++){
				for (int i = 0; i<tab2[j].length; i++){
					System.out.print(tab2[j][i] + " ");
				}
				System.out.println();
				}
				
			System.out.println();
			
			pozycjaY += currentKier[0];
			pozycjaX += currentKier[1];
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}