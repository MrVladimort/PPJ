/**
 * Created by Gravv on 28.11.2016.
 */
public class Czw17 {
	
	//1
    static void Czw1 (int bok, char znak){

        char [][] kwadrat = new char [bok][bok];
        for (int i = 0; i<kwadrat.length; i++){
            for(int j = 0; j<kwadrat[i].length; j++){
                kwadrat[i][j] = znak;
                if (znak == 'x')
                    znak = 'o';
                else if (znak == 'o')
                    znak = 'x';
                System.out.print(kwadrat[i][j] + " ");
            }
			if (znak == 'x')
				znak = 'o';
            else if (znak == 'o')
				znak = 'x';
            System.out.println();
        }
    }
	
	//2
    static void Czw2(char [][] ala){
	
	
        int counter = 0;
        for(int i =0; i<ala.length;i++){
            for (int j = 0; j<ala[i].length-2;j++){
                if(ala[i][j]=='a'&& ala [i][j+1]=='l'&& ala[i][j+2]=='a')
                    counter++;}
        }
        for(int i =0; i<ala.length;i++){
            for (int j = 0; j<ala[i].length-2;j++){
                if (ala[j][i]=='a'&& ala[j+1][i]=='l'&& ala[j+2][i]=='a')
                    counter++;}
        }

        for (int j = 0; j<ala.length-2;j++)
            for (int i = 0; i < ala.length-2; i++)
                if (i >= 1 && i < ala.length - 1 && j >= 1 && j < ala[j].length -1 && ala[j][i] == 'l' && ala[j+1][i+1] == 'a' && ala[j-1][i-1] == 'a')
                    counter++;

        for (int j = 0; j<ala.length-2;j++)
            for (int i = 0; i < ala.length-1; i++)
                if (i >= 1 && i < ala.length - 1 && j >= 1 && j < ala[j].length -1 && ala[j][i] == 'l' && ala[j-1][i+1] == 'a' && ala[j+1][i-1] == 'a')
                    counter++;

        System.out.println("\n"+ "Count 'ala' = "+counter);
    }

	//3
    static boolean isDiagonal (int alo [][]){

        for(int i = 0; i<alo.length; i++)
                if (alo[i].length != alo.length || alo[i][i] == 0)
					return false;
				
		return true;
    }
	
	/*4 
	static int Euklid(int a, int b){
		
		while (b!=0)

		b = a%b;
		a = b;

		return a;
	}
	*/

    public static void main (String [] args){
		
		//1
        Czw1(8, 'o');
        System.out.println("====================");
		
		//2
        char tab [][] = new char[8][8];
		
		for (int i = 0; i<tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (char)(97 + (int)(Math.random()*26));
				System.out.print(tab[i][j] + " ");
            }
			System.out.println();
        }
		
        Czw2(tab);
        System.out.println("====================");

		//3
        int [][] tab2 = new int[9][9];
		for (int i = 0; i<tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
				if(i == j)
					tab2[i][j] = 1;
				else
					tab2[i][j] = 0;
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n" + isDiagonal(tab2));
		System.out.println("=====================");
		
		//4
		//System.out.println("\n" + Euklid(48, 36));
    }

}