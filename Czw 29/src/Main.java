import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        {
            String text = "Jan III Sobieski herbu Janina (ur. 17 sierpnia 1629 w Olesku, "
            		+ "zm. 17 czerwca 1696 w Wilanowie) – król Polski i wielki książę litewski od 1674, "
            		+ "hetman wielki koronny od 1668, hetman polny koronny od 1666, "
            		+ "marszałek wielki koronny od 1665, chorąży wielki koronny od 1656. ";
            
            String data = ("[0-9][1-9] [sierp][a-z]+[.]?|[czerw][a-z]+[.]? [1-9][0-9]{3}");
            String rok = ("[0-9][1-9]{3}"); 
            String wielkalitera = ("[A-Z][a-z]+"); 
            String krapka = ("[.]"); 
            String znaki = ("[.]?[,]?[ ]?"); 
           
            Pattern tab [] = {
                    Pattern.compile(data),
                    Pattern.compile(rok),
                    Pattern.compile(wielkalitera),
                    Pattern.compile(krapka),
                    Pattern.compile(znaki)
            };

            int [] count = new int [tab.length];
            for(int i = 0; i <tab.length; i++) {
                Matcher m = tab[i].matcher(text);
                boolean b = m.find();
                while (b) {
                    b = m.find();
                    count[i]++;
                }
                System.out.println(count[i]);
            }
        }
    }
}