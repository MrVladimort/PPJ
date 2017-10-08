import java.util.*;
class Czw14 {
	public static void main(String [] args){
	java.util.Scanner sc = new java.util.Scanner(System.in); // <- umiesc ta deklaracje tak , aby byla widoczna w calym programie
	char [][] tab = new char [3][3];
	int [] pozycija = new int [2];
	char [] proverka = new char [3];
	boolean pot = true;
	boolean pow = true;
	int i = 0;
	char znak;
	System.out.println("Czesc, to jest gra Kolko i krzyzyk.");
	System.out.println("Guide: Trzeba wpisac (x,y) od -1 do 1");
	System.out.println("==================");
	System.out.println(" -1,1| 0,1|1,1");
	System.out.println("==================");
	System.out.println(" -1,0| 0,0|1,0");
	System.out.println("==================");
	System.out.println("-1,-1|0,-1|1,-1");
	System.out.println("==================");
			while(i<9 && pot){ // odczytaj chod X i vyvedi na ekran
				pow = true;
				if (i % 2 == 0){
					znak = 'X';
					System.out.println("Czerga X");}
				else{
					znak = 'O';
					System.out.println("Czerga O");}
				while(pow){
				System.out.print("pozycija x = ");
				int ix = sc.nextInt(); // odczytaj w spolrzedna x
				System.out.print("pozycija y = ");
				int iy = sc.nextInt(); // odczytaj w spolrzedna y 
				pozycija[0] = ix;
				pozycija[1] = iy;
					// proverka koordinat
					if (tab[0][0] != 'X' && tab[0][0] != 'O' && pozycija[0] == -1 && pozycija[1] == 1){
						tab[0][0] = znak;
						pow = false;}
					else if (tab[1][0] != 'X' && tab[1][0] != 'O' && pozycija[0] == -1 && pozycija[1] == 0){
						tab[1][0] = znak;
						pow = false;}
					else if (tab[2][0] != 'X' && tab[2][0] != 'O' && pozycija[0] == -1 && pozycija[1] == -1){
						tab[2][0] = znak;
						pow = false;}
					else if (tab[0][1] != 'X' && tab[0][1] != 'O' && pozycija[0] == 0 && pozycija[1] == 1){
						tab[0][1] = znak;
						pow = false;}
					else if (tab[1][1] != 'X' && tab[1][1] != 'O' && pozycija[0] == 0 && pozycija[1] == 0){
						tab[1][1] = znak;
						pow = false;}
					else if (tab[2][1] != 'X' && tab[2][1] != 'O' && pozycija[0] == 0 && pozycija[1] == -1){
						tab[2][1] = znak;
						pow = false;}
					else if (tab[0][2] != 'X' && tab[0][2] != 'O' && pozycija[0] == 1 && pozycija[1] == 1){
						tab[0][2] = znak;
						pow = false;}
					else if (tab[1][2] != 'X' && tab[1][2] != 'O' && pozycija[0] == 1 && pozycija[1] == 0){
						tab[1][2] = znak;
						pow = false;}
					else if (tab[2][2] != 'X' && tab[2][2] != 'O' && pozycija[0] == 1 && pozycija[1] == -1){
						tab[2][2] = znak;
						pow = false;}
					else 
						System.out.println("Wprowadz inny warunki X i Y");
					}	
				System.out.println("=========================");
				for (int k = 0; k<tab.length; k++){ // wyswietl
					for (int j = 0; j<tab.length; j++){
						System.out.print(tab[k][j] + " ");}
					System.out.println();}
				System.out.println("=========================");
				for(int k = 0; k<tab.length; k++){ // proverka po gorizontali
					for(int j = 0; j<tab.length; j++){
						proverka[j] = tab[k][j];}
					if (proverka [0] == znak && proverka[0] == proverka[1] && proverka[0] == proverka[2]){
						System.out.println(znak + " wygraw");
						pot = false;}
				}
				for(int k = 0; k<tab.length; k++){ // proverka po vertikali
					for(int j = 0; j<tab.length; j++){ 
					proverka[j] = tab[j][k];}
					if (proverka [0] == znak && proverka[0] == proverka[1] && proverka[0] == proverka[2]){
						System.out.println(znak + " wygraw");
						pot = false;}
				}
					if (tab[0][0] == znak && tab[0][0] == tab[2][2] && tab[0][0] == tab[1][1]){ // proverka po diagonali sleva na pravo
						System.out.println(znak + " wygraw");
						pot = false;
					}else if (tab[0][2] == znak && tab[0][2] == tab[2][0] && tab[0][2] == tab[1][1]){ // proverka po diagonali sprava na levo
						System.out.println(znak + " wygraw");
						pot = false;}
			i++;
			if(i > 8 && pot)
			System.out.println("Koniec gry: nikt nie wygraw!!! ^_^");
		}
	}
}