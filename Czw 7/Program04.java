public
	class Program04 {
		
	public static void main (String[] args){
		// === 1 ===
		{
		System.out.println("====Czw 1====");
		
		boolean czyPada = true;
		boolean czySwieciSlonce = false;

		if (czyPada == true && czySwieciSlonce == true)
			System.out.println("tecza");
		else if (czyPada == false && czySwieciSlonce == false)
			System.out.println("pochmurno");
		else if (czyPada == true && czySwieciSlonce == false)
			System.out.println("plucha");
		else
			System.out.println("slonecznie");
		}
		
		// === 2 ===
		{
		System.out.println("====Czw 2====");
		boolean	Czypada = true;
		int a = Czypada ? 5 : 8;
		System.out.println(a);
		}
		
		// === 3 ===
		{
		System.out.println("====Czw 3====");
		char liczba = 'a';
		if (liczba == 'A' || liczba == 'a')
			System.out.println("w systemie dziesietnej 10");
		else if (liczba == 'B' || liczba == 'b')
			System.out.println("w systemie dziesietnej 11");
		else if (liczba == 'C' || liczba == 'c')
			System.out.println("w systemie dziesietnej 12");
		else if (liczba == 'D'|| liczba == 'd')
			System.out.println("w systemie dziesietnej 13");
		else if (liczba == 'E' || liczba == 'e')
			System.out.println("w systemie dziesietnej 14");
		else if (liczba == 'F' || liczba == 'f')
			System.out.println("w systemie dziesietnej 15");
		else if (liczba == '0')
			System.out.println("w systemie dziesietnej 0");
		else if (liczba == '1')
			System.out.println("w systemie dziesietnej 1");
		else if (liczba == '2')
			System.out.println("w systemie dziesietnej 2");
		else if (liczba == '3')
			System.out.println("w systemie dziesietnej 3");
		else if (liczba == '4')
			System.out.println("w systemie dziesietnej 4");
		else if (liczba == '5')
			System.out.println("w systemie dziesietnej 5");
		else if (liczba == '6')
			System.out.println("w systemie dziesietnej 6");
		else if (liczba == '7')
			System.out.println("w systemie dziesietnej 7");
		else if (liczba == '8')
			System.out.println("w systemie dziesietnej 8");
		else if (liczba == '9')
			System.out.println("w systemie dziesietnej 9");
		else
			System.out.println("Nie poprawny znak w systeme heksadecymalnej");
		}
		
		{
		System.out.println("=========================");
		char l = 'D';
		int wrt = 1;	
		if (l>='0' && l<='9')
			wrt = l - '0';
		else if (l>='A' && l<='F')
			wrt = 10 + (l - 'A');
		System.out.println(wrt);
		}



		// === 4 ===
		{
		System.out.println("====Czw 4====");
		
		int dzien = 17;
		int miesiac = 10;

		if (miesiac > 12 || dzien > 31)
			System.out.println("Nie poprawna data.");
		else if (miesiac == 1)
			System.out.println(dzien);
		else if (miesiac == 2)
			System.out.println(31 + dzien);
		else if (miesiac == 3)
			System.out.println(31 + 29 + dzien);
		else if (miesiac == 4)
			System.out.println(31 + 29 + 31 + dzien);
		else if (miesiac == 5)
			System.out.println(31 + 29 + 31 + 30 + dzien);
		else if (miesiac == 6)
			System.out.println(31 + 29 + 31 + 30 + 31 + dzien);
		else if (miesiac == 7)
			System.out.println(31 + 29 + 31 + 30 + 31 + 30 + dzien);
		else if (miesiac == 8)
			System.out.println(31 + 29 + 31 + 30 + 31 + 30 + 31 + dzien);
		else if (miesiac == 9)
			System.out.println(31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + dzien);
		else if (miesiac == 10)
			System.out.println(31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dzien);
		else if (miesiac == 11)
			System.out.println(31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dzien);
		else if (miesiac == 12)
			System.out.println(31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dzien);
		}
		{
		System.out.println("=========================");
		int dzien = 17, miesiac = 1;
		int dni = 0;
		miesiac = miesiac - 1;
		if (miesiac>=2) 
		{
			dni = dni + 60;
			miesiac = miesiac - 2;
				if (miesiac % 2 == 0) dni = dni + 31*(miesiac/2) + 30*(miesiac/2);
				else dni = dni + 31*(miesiac/2 + 1) + 30*(miesiac/2);
		}
		else if (miesiac==1) dni = dni + 31;
		dni = dni + dzien;
		System.out.println(dni);
		}
	
		// === 5 ===
		{
		System.out.println("====Czw 5====");
		
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int z = (int) (Math.random() * 10);
		
		if (x>y && x>z) {
			System.out.println("'X' jest najwieksza = "+ x);
		}else if (y>x && y>z){
			System.out.println("'Y' jest najwieksza = "+ y);
		}else if (z>x && z>y){
			System.out.println("'Z' jest najwieksza = "+ z);
		}else{
			System.out.println("Nie ma najwieksza zmiennei");
		}
		System.out.println(x + ", " + y + ", " + z);
		
		System.out.println("======================");
		}
	}	
	}