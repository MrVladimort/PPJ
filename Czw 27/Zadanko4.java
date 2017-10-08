import java.io.*;

public class Zadanko4{

		public static void main(String[] args){
				new Zadanko4().CodeFormorter();
			}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		public void CodeFormorter(){
			try{
			    /*
				System.out.print("Path to source file:  ");
				String source = reader.readLine();
				System.out.print("Path to output file:  ");
			    String output = reader.readLine();
				*/
			    String source = "C:\\Users\\s15567\\workspace\\Czw27\\src\\Main.java";
                String output = "C:\\Users\\s15567\\workspace\\Czw27\\src\\FireWriter.txt";

				FileReader fr = new FileReader(source);
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				FileWriter wr = new FileWriter(output);

				while(line != null){
					boolean a = true;
					boolean b = false;
                    String tmp = "";

					for(int i = 0; i<line.length() && a; i++){
						if(line.charAt(i)== '{'){
						    for(int j = 0; j<i; j++)
						        tmp = tmp + line.charAt(j);
                            line = tmp + "    {";
							a = false;
						}
                    }
					
					tmp = "";
					
					/*
					for(int i = 0; i<line.length() && a; i++){
						if(line.charAt(i)== '}'){
						    for(int j = 0; j<i; j++){
						    	if (b && line.charAt(i) != ' '){
					    			tmp = "    " + tmp;
					    			b = false;}
						        tmp = tmp + line.charAt(j);
						    	}
						    }
						}
					
					*/
                    wr.write(line);
                    wr.write('\n');
                    line = br.readLine();
				}

				wr.close();
				fr.close();

			}catch (FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
