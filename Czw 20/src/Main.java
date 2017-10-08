
public class Main {

	public static void main(String[] args) {
		new B();
		
		String ala = "Ala ma kota";
		
		
		System.out.println(ala.charAt(5));
		System.out.println(ala.charAt(7));
		System.out.println(ala.indexOf('k'));
		System.out.println(ala.indexOf('k', 7+1));
		
		//4
		for (int i = 0; i < ala.length(); i++){
			if (ala.charAt(i) != ' ')
				System.out.print(ala.charAt(i));
			else 
				System.out.println();
		}
		
		System.out.println("\n" + "===========================");
		
		//4
		int tmp = 0;
		do{
			int wrt = ala.indexOf(' ', tmp + 1);
			System.out.println(tmp + " " + wrt);
			System.out.println(ala.substring(tmp, wrt < 0 ? ala.length() : wrt));
			tmp = wrt;
		}while(tmp != -1);
	}
}

class B {
	
	public B (){
		System.out.println(this);
	}
}
