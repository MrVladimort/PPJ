import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServerLog   {
        public static void main(String[] args) {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                FileReader fileReader = new FileReader("C:\\Users\\s15567\\workspace1\\Czw 29\\src\\serverLog.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int c;
                while ((c = bufferedReader.read()) != -1){
                    stringBuffer.append((char) c);
                }
                fileReader.close();
            }catch (FileNotFoundException e){
                e.getMessage();
            }catch (IOException ex){
                ex.getMessage();
            }

            String [][] tab = new String [100][3];
            String wiadomosc = "([>].*)"; 
            String ip = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
            		+ "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
            String data = "(\\d{1,2}[/][0-3]?[0-9][/][1-9][0-9]{3})"; 
            
            Pattern [] tabpattern = {
                    Pattern.compile(ip),
                    Pattern.compile(data),
                    Pattern.compile(wiadomosc)
            };

            for(int i = 0; i<tabpattern.length; i++) {
            	Matcher m = tabpattern[i].matcher(stringBuffer);
                boolean b = m.find();
                int j = 0;
                while (b && j < 100) {
                	tab[j][i] = m.group();
                    j++;
                    b = m.find();
                }
            }
            for(int i = 0; i<tab.length; i++){
	            System.out.print(tab[i][0] + " ");
	            System.out.print(tab[i][1] + " ");
	            System.out.println(tab[i][2] + " ");
            }
        }
}

