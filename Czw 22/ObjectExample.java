package c22.g12;

public 
	class ObjectExample {
	
	private int value;
	private boolean state;
	private B text;
	
	public ObjectExample(){
		value = 0;
		state = false;
		text = null;
	}
	
	public ObjectExample(int value, boolean state, B text){
		this.value = value;
		this.state = state;
		
		//this.text = text;
		this.text = new B();
		this.text.wrt = text.wrt;
	}
	
	public ObjectExample(ObjectExample ox){
		this(ox.value, ox.state, ox.text);
	}
	
	public String toString(){
		return "ObjectExample:\n\tvalue: "+value+"\n\tstate: "+state+"\n\ttext: "+text.wrt;
	}
}
