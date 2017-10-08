import java.util.Arrays;

public class Czw13 {

    public static void main(String[] args){

    // 1

    int [] tab = new int [10];
	
			for (int i = 0; i<tab.length; i++){
		tab[i] = (int)(Math.random()*2);
			}
			
			for (int i = 0; i<tab.length; i++){
				System.out.print(tab[i] + " ");
			}
			System.out.println();
			
	//-------------------------------
		
    int[] tab10 = {1,0,1};
    int c = 0, ilosc = 0;

        for (int i = 0; i<tab.length; i++){
            if (tab[i]==tab10[c]) {
                c++;
                if (c == 3) {
                    ilosc++;
                    c = 0;
                }
            }
            else c = 0;
        }
        System.out.println(ilosc);
		System.out.println("===================================");

    // 2

    double[] t1 = new double[3];
    double[] t2 = new double[3];
    double[] t3 = new double[3];

        for (int i = 0; i< t1.length; i++){
            t1[i] = Math.random()*5;
            t2[i] = Math.random()*5;
        }

	//---------------------------------
		
        for (int i = 0; i<t3.length; i++){
            t3[i] = t1[i] + t2[t2.length - 1 - i];
        }
		
	//---------------------------------
		
        for (int i = 0; i<t3.length; i++)
            System.out.print(t1[i] + "  ");
        System.out.println();

        for (int i = 0; i<t3.length; i++)
            System.out.print(t2[i] + "  ");
        System.out.println();
		
        for (int i = 0; i<t3.length; i++)
            System.out.print(t3[i] + "  ");
        System.out.println();
		
		System.out.println("===================================");
		
	// 3

    //System.out.print(char[i]+int[i]);

    char [] czw3 =  {'R', 'a', 't', 'c', 'h', 'e', 't'};
    int [] integer = new int [czw3.length];
        for (int i = 0; i<czw3.length; i++){
                System.out.print(czw3[i]);
            }
        System.out.println();

        for (int i = 0; i<czw3.length; i++) {
            int a = (int) czw3[i] + i;
            integer[i] = a;
            System.out.print(a + " ");
        }
            System.out.println();
			
        for (int i = 0; i<czw3.length; i++) {
            char a = (char) (integer[i] - i);
            System.out.print(a);
        }
    System.out.println();
	System.out.println("===================================");


	
	// 4
	/*
        char [] [] czw4 = {
		{'S', 'a', 'm', 's', 'u', 'n', 'g'},
        {'N', 'o', 'k', 'i', 'a' },
        {'A', 'p', 'p', 'l', 'e' },
        {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
        {'A', 'l', 'c', 'a', 't', 'e', 'l'},
        {'S', 'o', 'n', 'y' },
        {'J', 'o', 'l', 'l', 'a'}
        };
		
    // 4.1
		
		
		System.out.println("==================4.1=================");
	// 4.2
		
        for (int i = 0; i<czw4.length; i++){
            int warunek = 0;
			
            for(int j = 0; j<czw4[i].length; j++){
                int znak = (int)(czw4[i][j]);
                ilosc = 0;
				
                for (int n = j; n<czw4[i].length && ilosc<3; n++){
                    if ((int)(czw4[i][n]) == znak) 
						ilosc++;
                }
				
            if (ilosc > 2) warunek++;
            }
			
		System.out.println(warunek);
        }
		
		System.out.println("================4.2===================");
	// 4.3
		System.out.println("=================4.3==================");
	// 4.4
	
		System.out.println("=================4.4================");
	*/	
	
	// 5
	int tab5 [] = new int [(int)(Math.random()*15)];
		for (int i = 0; i<tab5.length; i++){
			tab5[i] = (int)(Math.random()*10);
			}
			
		for (int i = 0; i<tab5.length; i++){
			System.out.print(tab5[i] + " ");
			}
		System.out.println();
	
	//-----------------------------------------------------------------
			
	int tabnew [] = new int [tab5.length*2];
		for (int i = 0; i<tab5.length; i++){
			tabnew[i] = tab5[i];
		}
		
		for (int i = 0; i<tabnew.length; i++){
			System.out.print(tabnew[i] + " ");
			}
		System.out.println();
		
		System.out.println(tab5.length);
		System.out.println(tabnew.length);
		System.out.println();
	
	
		for(int i=0; i < tabnew.length - 1; i++){
		
			int maxValIndex1 = i;
			for(int j = i+1; j < tabnew.length; j++){
				if( tabnew[maxValIndex1] < tabnew[j])
					maxValIndex1 = j;
			}
			
			{
				int tmp = tabnew[i];
				tabnew[i] = tabnew[maxValIndex1];
				tabnew[maxValIndex1] = tmp;
			}
		}
			
		for(int i=0; i < tabnew.length/2; i++)
				tabnew[tabnew.length/2 + i] = tabnew[tabnew.length/2-i];
		
		for (int i = 0; i<tabnew.length; i++){
			System.out.print(tabnew[i] + " ");
			}
		System.out.println();
		
		
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
    }
}