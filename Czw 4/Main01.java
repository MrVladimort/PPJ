public
	class Main01 {
		
	public static void main(String[] args){
		//typ nazwa;
		// typ logiczny
		boolean typLogiczny;
		
		//typ liczbowy
		int typLiczbCalkowitych;
		double typLiczbRzeczywistych;
		char typLiczbowy;
		
		// init
		
		typLogiczny = true;
		typLiczbCalkowitych = 10;
		typLiczbRzeczywistych = 3.14;
		typLiczbowy = 'a';
		
		System.out.println(typLiczbCalkowitych);
		
		float tlr = 3.14f;
		
		typLiczbCalkowitych = (int)tlr;
		
		
		System.out.println(tlr);
		System.out.println(typLiczbCalkowitych);
		
		
		{
			int myRangeTest = 50;
			System.out.println(myRangeTest);
			{
				System.out.println(myRangeTest);
			}
			System.out.println(myRangeTest);
		}
		
		typLiczbCalkowitych = 3 + 5;
		System.out.println(typLiczbCalkowitych);
		typLiczbCalkowitych = typLiczbCalkowitych - 5;
		System.out.println(typLiczbCalkowitych);
		
		typLiczbowy = (char)(typLiczbowy + 128);
		System.out.println(typLiczbowy);
		System.out.println(typLiczbowy - 128);
		
		System.out.println( 5 % 2);
		
		typLiczbCalkowitych = typLiczbCalkowitych + 1;
		//typLiczbCalkowitych++;
		//++typLiczbCalkowitych;
		System.out.println("=======");
		System.out.println(typLiczbCalkowitych);
		System.out.println(typLiczbCalkowitych++);
		System.out.println(typLiczbCalkowitych);
		System.out.println(++typLiczbCalkowitych);
		
		int wrt = 3 * 5 + 18 -10 / 2;
		
		typLiczbCalkowitych += 6;
		
		System.out.println( 2==5 ? 5 : 10);
		System.out.println( 2!=5 ? 5 : 10);
		System.out.println( !false ? 5 : 10);
		
		System.out.println("=========");
		System.out.println( 10? "Koniec wykladu" : "kontynuujemy");
	}
}













