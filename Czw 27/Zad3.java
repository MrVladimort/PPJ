import java.io.FileReader;
import java.io.StreamTokenizer;

public class Zad3 {
	
	String [] keywords = {"abstract","continue","for","new","switch","assert","default","goto",
            "package","synchronized","boolean","do","if","private","this","break","double",
            "implements","protected","throw","byte","else","import","public","throws","case",
            "enum","instanceof","return","transient","catch","extends", "int","short","try",
            "char","final","interface","static","void","class","finally","long","strictfp",
            "volatile","const","float","native","super","while"};

    int[] tab = new int[keywords.length];
	
	public static void main(String[] args){
        Zad3 obj = new Zad3();
        obj.scanfile();     
    }
	
    public void scanfile(){
       for(int i = 0; i<tab.length; i++)
           tab[i] = 0;
        int tmp;
        try(FileReader fl = new FileReader("Z:\\1 rok\\PPJ\\Czw 25\\src\\Magazyn.java")){
            StreamTokenizer tk = new StreamTokenizer(fl);
            tmp = tk.nextToken();
            while (tmp != StreamTokenizer.TT_EOF){
                if(tmp == StreamTokenizer.TT_WORD){
                    String temp = tk.sval;
                        for (int i = 0; i < keywords.length; i++) {
                            if (temp.equals(keywords[i]))
                                tab[i]++;
                        }

                }
                tmp = tk.nextToken();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        for(int i = 0; i<keywords.length; i++){
            System.out.print(keywords[i]+"  "+tab[i]);
            System.out.println();
        }

    }


    
}
