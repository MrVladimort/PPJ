public class Wyraz {
        String line;
        int number;

        public Wyraz(){ // void null
            line = "";
            number = 0;
        }

        public void dodajZnak(char znak){
            line += znak;
            number++;
        }

        public String toString(){
            return line;
        }

        public int length(){
            return number;
        }
}

