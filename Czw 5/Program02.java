public
	class Program02 {
		
	public static void main(String[] args){
		
		//1
		System.out.println ("===========");
		float x = (2e-2f);
		long y = (564L);
		System.out.println (x);
		System.out.println (y);
		System.out.println ("===========");
		//2
		byte l = (47);
		double i = (3.14);
		int z = (111);
		char a = ('Z');
		
		char b = (char) (a+z);
		System.out.println (b);
		
		int q = (z+a);
		System.out.println (q);
		
		float t = (float) (x+i);
		System.out.println (t);
		
		byte v = (byte) (l+z);
		System.out.println (v);
		System.out.println ("===========");
		//3
		boolean CzyPada = true; 
		System.out.println (CzyPada ? "Pada" : "Nie Pada");
		System.out.println ("===========");
	
		//4
		int zbior = 16;
		System.out.println ( zbior>=0 && zbior<=1 ? "C" : ((zbior>=0 ? "A" : "B")));
		System.out.println("=========");
		//5
		byte o = 5;
		byte p = 10;
		Object obj = (o + p);
		if (obj instanceof Integer) {
			System.out.println(o + p);
		}
		System.out.println("=========");
			
			
		}
	}