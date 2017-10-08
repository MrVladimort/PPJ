public class B {

       	public B (){ 
           System.out.println(this);
        }

       static void staticShowThis(B b){
    	   b.nstaticShowThis();
        }

       public void nstaticShowThis(){
           System.out.println(this);
        }
}
