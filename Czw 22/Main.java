package c22.g12;

public 
	class Main {

	public static void main(String[] args) {
		
		B b = new B();
		b.wrt = 5;
		
		ObjectExample oe = new ObjectExample( 10, true, b);
		System.out.println(oe);
		
		b.wrt = 8;
		
		System.out.println(oe);
	}
}

class B{
	int wrt;
}
