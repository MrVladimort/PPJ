import java.io.*;
import java.util.regex.*;

public 
	class Main {

	public static void main(String[] args) {
		//==============================1
		{String [] tab  = {"aaaabbcch", "bbaaaacch", "ccaaacch", "bbaaaabbh", "abch"};
		Pattern p = Pattern.compile("[abc]*h"); //czy jest h na koncu slowa
		for(int i=0; i < tab.length; i++){
			Matcher m = p.matcher(tab[i]);
			boolean b = m.matches();
			System.out.println(tab[i] + " - " + b);
		}
		System.out.println();
		}
		//===============================2
		{StringBuffer sb = new StringBuffer();
		try{
			FileReader fr = new FileReader("C:\\Users\\s15567\\workspace\\Czw 28\\src\\czw28.txt");
			int chr;
			while((chr = fr.read()) != -1){
				sb.append((char)chr);
			}
			fr.close();
			System.out.println(sb);
			
		}catch( FileNotFoundException ex){
			ex.getMessage();
		}catch( IOException ex){
			ex.getMessage();
		}
		
		System.out.println();
		
		//Pattern pattern = Pattern.compile("[1-9][0-9]{3}-[0-9][0-9]{3}");
		Pattern pattern = Pattern.compile("\\d+[-]\\d+");
		Matcher m = pattern.matcher(sb);
		boolean b = m.find();
		while(b){
			System.out.println(m.group() + " " + b);
			b = m.find();
		}
		}
		//================================3
		{StringBuffer sb = new StringBuffer();
		try{
			FileReader fr = new FileReader ("C:\\Users\\s15567\\workspace\\Czw 28\\src\\onet.pl.txt");
			int c;
			while((c = fr.read()) != -1){
				sb.append((char)c);
			}
			fr.close();
		}catch( FileNotFoundException ex){
			ex.getMessage();
		}catch( IOException ex){
			ex.getMessage();
		}
		System.out.println();
		
		Pattern pattern = Pattern.compile("<h[1-6]>");
		Matcher m = pattern.matcher(sb);
		boolean b = m.find();
		while(b){
			System.out.println(m.group() + " " + b);
			b = m.find();
		}
		}
		
		
	}
}