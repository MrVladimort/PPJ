public class Czw15 {
	public static void main(String[] args) {
	
	//1
	System.out.println("\n"+"============Czw 1=============");
	double[][] punkt = {
	{1},
	{0},
	{0}
	};
	double[][] obrot = {
	{0, -1, 0},
	{1, 0, 0},
	{0, 0, 1}
	};

	double[][] rezultat = new double[3][1];

	for (int i = 0; i < obrot.length; i++){
		double summ = 0;
		for (int j= 0; j< obrot[i].length; j++){
			summ += obrot[i][j]*punkt[j][0];
		}
		rezultat[i][0] = summ;
	}
	for (int j= 0; j< rezultat.length; j++) 
		System.out.println(rezultat[j][0]);
		
	

	//2
	System.out.println("\n"+"===============Czw 2===============");
	
		int tabl[][] = new int[10][10];

		for (int i = 0; i<tabl.length; i++){
			for (int j = 0; j<tabl[i].length; j++){
				tabl[i][j] = (int)(Math.random()*10);
				System.out.print(tabl[i][j]+" ");
			}
			System.out.println();
		}
		
		int tabl2[][] = new int[12][12];
		
		for (int i = 1; i<tabl2.length-1; i++){
			for (int j = 1; j<tabl2[i].length-1; j++){
				tabl2[i][j] = tabl[i-1][j-1];
			}
		}
		
		int seredneI = 0, seredneJ=0, maxymalnaSuma = 0;
		int suma = 0;
		
		for (int i = 1; i<tabl2.length-1; i++){
			for(int j = 1; j<tabl2.length-1; j++){
				suma = 0;
				suma += tabl2[i][j+1];
				suma += tabl2[i][j-1];
				suma += tabl2[i-1][j+1];
				suma += tabl2[i-1][j];
				suma += tabl2[i-1][j-1];
				suma += tabl2[i+1][j+1];
				suma += tabl2[i+1][j-1];
				suma += tabl2[i+1][j];

				if (suma>maxymalnaSuma) {
					seredneI = i-1;
					seredneJ = j-1;
					maxymalnaSuma = suma;
				}
			}
		}
	
	System.out.println("\n" + "Maxymalna Suma " + maxymalnaSuma + ", " + "Index ["+seredneI+"]["+seredneJ+"]");

	//3
	System.out.println("\n"+"============Czw 3============");

	char[][] tab3 = new char[5][5];
	for(int i =0; i<tab3.length;i++)
		for (int j = 0; j<tab3[i].length;j++) {
			int temp = (int)(Math.random()*2);
			if(temp == 0) tab3[i][j] = 'a';
			else tab3[i][j] = 'l';
			}
			
	for(int i = 0; i< tab3.length;i++) {
		for (int j = 0; j < tab3[i].length; j++){
			System.out.print(tab3[i][j]+" ");
		}
		System.out.println();
	}

	int counter = 0;
	for(int i =0; i<tab3.length;i++){
		for (int j = 0; j<tab3[i].length-2;j++){
			if(tab3[i][j]=='a'&& tab3 [i][j+1]=='l'&& tab3[i][j+2]=='a')
				counter++;}
	}
	for(int i =0; i<tab3.length;i++){
		boolean pow = true;
		for (int j = 0; j<tab3[i].length-2;j++){
			if (tab3[j][i]=='a'&& tab3[j+1][i]=='l'&& tab3[j+2][i]=='a')
				counter++;}
	}

	for (int j = 0; j<tab3.length-2;j++)
		for (int i = 0; i < tab3.length-2; i++)
			if (i >= 1 && i < tab3.length - 1 && j >= 1 && j < tab3[j].length -1 && tab3[j][i] == 'l' && tab3[j+1][i+1] == 'a' && tab3[j-1][i-1] == 'a')
				counter++;
	
	for (int j = 0; j<tab3.length-2;j++)
		for (int i = 0; i < tab3.length-1; i++)			
				if (i >= 1 && i < tab3.length - 1 && j >= 1 && j < tab3[j].length -1 && tab3[j][i] == 'l' && tab3[j-1][i+1] == 'a' && tab3[j+1][i-1] == 'a')
				counter++;	
	
		System.out.println("\n"+ "Count 'ala' = "+counter);
	
	//4
	System.out.println("\n"+"================Czw 4================");

	int[][] tab4 = new int[15][15];
	for(int k = 0; k<tab4.length;k++) {
		for (int i = k; i < tab4.length - k; i++) {
			for (int j = k; j < tab4.length - k; j++) {
				tab4[i][j] = k;
			}
		}
	}
	
	for(int i =0; i<tab4.length;i++){
		for (int j = 0; j<tab4[i].length;j++){
			System.out.print(tab4[i][j]+" ");
		}
	System.out.println();}
	
	}
}