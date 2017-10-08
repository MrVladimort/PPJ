/**
 * Created by Влад on 05.02.2017.
 */
public class ZadDwa{
    public static void main(String [] args){
        int mat [][] = {
                {1, 2, 3, 4},
                {5, 6 , 7, 8},
                {9, 10, 11, 12}
                };

        try {
            fun (mat ,0,0);
            }catch(Exception ex){
            System.out.println(ex);
            }

        C c = new C (15);
        new C (10);
        c = new C (null);
        new C(c);

        D.make().show();
    }

    public static void fun ( int [ ] tab , int i , int j ) {
        for ( int k = 0 ; k < i ; k++){
            System.out.print ("I"+tab [ k]+", ");
        }
        System.out.println();
    }

    public static int fun (int [][] tab, int i, int j){
        if ( i >= 0 && j >= 0){
            System.out.println ( "H"+tab [i][j]);
            return tab [i][j] + fun (tab, i+1, j+1);
            }else{
            return 0;
        }
    }
}

class C{
    int wrtI ;
    C next ;

    private C(){
        System.out.println("G"+wrtI);
        D.make().add(this);
    }

    public C(int wrtI){
        this();
        this.wrtI = wrtI;
        System.out.println("F"+wrtI);
    }

    public C (C objC){
        this(objC != null ? (objC.wrtI-1) : 20);
        System.out.println("E"+wrtI);
    }

    public String toString(){
        return "D"+wrtI;
    }
}

class D{
    private static D struct;

    public static D make(){
        System.out.println ("C");
        if (struct == null)
            struct = new D();
        return struct;
    }

    private C head;

    private D(){
        head = null;
        System.out.println("B");
    }

    public void add (C obj){
        if (head == null){
            head = obj;
            }else{
            C tmp = head;
            while (tmp.next != null)
                tmp = tmp.next ;
            tmp.next = obj ;
            }
        System.out.println("A");
        }

    public void show(){
        C tmp = head ;
        while (tmp != null){
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }
}