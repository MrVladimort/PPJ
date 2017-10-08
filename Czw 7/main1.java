package PPJ_07;

import Res.Res;

public class PPJ_07 extends Res {

	public static void main(String[] args) {
		paint1(1);// === 1 ===
		boolean czyPada = true;
		boolean czySwieciSlonce = false;

		if (czyPada == true && czySwieciSlonce == true)
			System.out.println("tecza - gdy pada i œwieci s³oñce");
		else if (czyPada == false && czySwieciSlonce == false)
			System.out.println("pochmurno - gdy nie œwieci s³oñce i nie pada");
		else if (czyPada == true && czySwieciSlonce == false)
			System.out.println("plucha – gdy pada i nie œwieci s³oñce");
		else
			System.out.println("s³onecznie - gdy œwieci s³oñce i nie pada");

		paint1(2);// === 2 ===
		int liczba;
		if (czyPada) {
			liczba = 5;
		} else {
			liczba = 8;
		}
		System.out.println("zmienna = " + liczba);

		paint1(3);// === 3 ===
		char znak = 'A';
		if (znak == 'A')
			System.out.println("w systemie dziesietnej = " + 10);
		else if (znak == 'B')
			System.out.println("w systemie dziesietnej = " + 11);
		else if (znak == 'C')
			System.out.println("w systemie dziesietnej = " + 12);
		else if (znak == 'D')
			System.out.println("w systemie dziesietnej = " + 13);
		else if (znak == 'E')
			System.out.println("w systemie dziesietnej = " + 14);
		else if (znak == 'F')
			System.out.println("w systemie dziesietnej = " + 15);
		else
			System.out.println("Nie poprawny znak.");

		paint1(4);// === 4 ===
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

		paint1(5);// === 5 ===
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int z = (int) (Math.random() * 10);
		System.out.println(x + " " + y + " " + z);

		int max = x;

		if (y > max) {
			max = y;
		}
		if (z > max) {
			max = z;
			System.out.println(max);
		} else {
			System.out.println(max);
		}
	}

}