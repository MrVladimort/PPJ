public
	class Program01 {
		public static void main(String[] args){
			System.out.println("Hello World!");
			
		boolean typLogiczny;
		int typLiczbCalkowitych;
		double typLiczbRzeczywistych;
		char typLiczbowy;
		byte x;
		
		x = 15;
		typLogiczny = true;
		typLiczbCalkowitych = 10;
		typLiczbRzeczywistych = 3.14;
		typLiczbowy = 'a';
		
		System.out.println(typLiczbCalkowitych);
		System.out.println(typLiczbRzeczywistych);
		System.out.println(typLiczbowy);
		System.out.println(typLogiczny);
		
		System.out.println("=======");
	
		float tlr = 3.14f;
		typLiczbCalkowitych = (int)tlr;
		
		System.out.println(tlr);
		System.out.println(typLiczbCalkowitych);
		
		System.out.println("=======");
		
		{
			int myRangeTest = 50;
			System.out.println(myRangeTest);
			{
				System.out.println(myRangeTest);
			}
			System.out.println(myRangeTest);
		}
		
		System.out.println("=======");
		
		System.out.println(typLiczbowy + typLiczbCalkowitych);
		System.out.println(typLiczbCalkowitych + typLiczbowy);
		System.out.println(tlr + typLiczbRzeczywistych);
		System.out.println(x + typLiczbCalkowitych);
		
		
		
	}
}
