    public class Walec {
        float r , h;

        public Walec(float r, float h){
        this.r = r;
        this.h = h;
        }

        public void Show(){
        System.out.println("------Walec------");
        System.out.println("Sp : " + (int)(h + Math.pow(r, 2) * Math.PI));
        System.out.println("V : " + (int)(Math.pow(r, 2) * Math.PI * h));
        }
}
