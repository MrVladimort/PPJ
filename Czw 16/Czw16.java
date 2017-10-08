import java.util.Arrays;


public class Czw16 {
	public static void main(String[] args) {
		
		System.out.println("==1==");
		show(12);
		
		System.out.println("==2==");
		int wrt = 8;
		System.out.println("wrt: "+wrt);
		modifyValue(wrt);
		System.out.println("wrt: "+wrt);
		
		System.out.println("==3==");
		char znak = 'a';
		ChekChar(znak);
		
		System.out.println("==4==");
		//4
		int x = 8;
		int y = 8;
		int [][] tab = new int [x][y];
			for (int i = 0; i < tab.length; i++){
				for (int j = 0; j < tab[i].length; j++){
						tab[i][j] = (int)(Math.random()*2);
				
				}
			}
			
		//4.1
		display(tab);
		
		//4.2
		fillRow(tab, 5, 9);
		
		//4.3
		fillCol(tab, 5, 9);
		
		//4.4
		fillRowFromTo(tab, 2, 1, 3, 8);
		
		//4.5
		//fillColFromTo(tab, 2, 1, 3, 8);
	}
	
	//1
	static void show(int a){
		System.out.println(a);
	}
	
	//2
	static void modifyValue (int tmp){
		
		System.out.println(tmp);
		tmp = tmp * 5;
		System.out.println(tmp);
		
	}
	
	//3
	static void  ChekChar (char znak){
		
		char alamakota [] = {'A','l','a','m','a','k','o','t','a'};
		System.out.println(Arrays.toString(alamakota));
			
		int counter = 0;
		for (int i = 0; i < alamakota.length; i++){
			if (alamakota[i] == znak)
					counter++;
		}
			
		System.out.println("Counter '" + znak + "': " + counter);
	}
	
	//4.1
	static void display (int tab [][]){
		for (int i = 0; i < tab.length; i++){
			for (int j= 0; j < tab[i].length; j++){
				System.out.print(tab[i][j]+ " ");
			}
		System.out.println();
		}
	}
	
	//4.2
	static void fillRow(int [][] tab, int row, int val){
		for (int i = 0; i<tab[row].length; i++)
			tab[row][i] = val;
		System.out.println("================================");
		display(tab);
			
	}
	
	//4.3
	static void fillCol(int [][] tab, int col, int val){
		for (int i = 0; i<tab.length; i++)
			tab[i][col] = val;
		System.out.println("================================");
		display(tab);
		
	}
	
	//4.4
	static void fillRowFromTo(int [][] tab, int row, int from, int to, int val){
		for (int i = 0; i<from+to; i++)
			tab[row][i+from] = val;
		System.out.println("================================");
		display(tab);
	}
	
	//4.5
	/*
	static void fillColFromTo(int[][] tab, int col, int from, int to, int val){
		for (int i = 0; i<from+to; i++)
			tab[i][col] = val;
		System.out.println("================================");
		display(tab);
	}
	*/
	
}