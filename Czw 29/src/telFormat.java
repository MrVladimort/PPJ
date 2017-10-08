import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class telFormat {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader fileReader = new FileReader("C:\\Users\\s15567\\workspace1\\Czw 29\\src\\telFormat.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int c;
            while ((c = bufferedReader.read()) != -1) {
                stringBuffer.append((char) c);
            }
            fileReader.close();


        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
		
        
        
        
        String number = ("([+]?[1-9]+?"
        		+ "([(]([0-9]{2})?[(.)]?[)]))?"
        		+ "[1-9]+?"
        		+ "[\\p{Blank}]?[0-9]+[-]?"
        		+ "[\\p{Blank}]?[-]?[_]?[0-9]+"
        		+ "[\\p{Blank}]?[-]?[_]?[0-9]+");
        
        /*String number = ("[+]?[1-9]{2}[(]([0-9]{2})?[.]?[)][0-9]+"); // +49(30)1234567 , 1 234-567
        String number2 = ("[0-9][\\p{Blank}]?[0-9]+[-][0-9]+[-]?([0-9]+)?");
        String number3 = ("[0-9]+[\\p{Blank}][0-9]+[\\p{Blank}][0-9]+"); // 123 456 789,
        String number4 = ("[0-9]+[_][0-9]+[_][0-9]+");//221_234_567
       
        
        
        Pattern [] tabp = {
                Pattern.compile(number),
                Pattern.compile(number2),
                Pattern.compile(number3),
                Pattern.compile(number4)
        };
		*/
		
		/*
		String number5 = ("([+]?[1-9]{2}[(]([0-9]{2})?[.]?[)][0-9]+)?"
			+ "([0-9][\\p{Blank}]?[0-9]+[-][0-9]+[-]?([0-9]+)?)?"
			+ "([0-9]+[\\p{Blank}][0-9]+[\\p{Blank}][0-9]+)?"
			+ "([0-9]+[_][0-9]+[_][0-9]+)?");
		*/
		
        
        	Pattern p = Pattern.compile(number);
        //for(int i = 0; i<tabp.length; i++) {
            Matcher m = p.matcher(stringBuffer);
            boolean b = m.find();
            while (b) {
                System.out.println(m.group() + " " + b);
                b = m.find();
            }
        //}
    }
}