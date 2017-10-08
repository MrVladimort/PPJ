public class Zad2 {

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12}
        };

        fun( mat, 0, 3);

        new A(12);
        A a = new A(15);
        new A(a);
        new A(5);

        B.make().show(a);
    }



    public static int fun(int[][] tab, int i, int j){
        try{
            int sum = 0;
            if(i < 4 &&  j < 4){
                System.out.println("A"+tab[i][j]);
                sum = tab[i][j] + fun(tab, i+1, i-1);
                return sum;
            }else
                return 0;
        } catch(Exception ex){
            System.out.println(ex);
        }
        return -1;
    }

    public static double fun(int[] tab, int i, int j){
        if(i >= 0 && j >= 0){
            System.out.println("B"+tab[(i*3)+j]);
            return tab[(i*3)+j] + fun(tab, i+1, j+1);
        }else
            return 0;
    }
}

class A{
    int wrtI;
    A next;

    private A(){
        System.out.println("C"+wrtI);
        next = null;
        B.make().add(this);
    }

    public A(int wrtI){
        this();
        this.wrtI = wrtI;
    }

    public A(A objA){
        this(objA.wrtI-1);
        System.out.println("E"+wrtI);
    }

    public String toString(){
        return "F" + wrtI;
    }
}

class B{
    private static B struct;
    public static B make(){
        System.out.println("G");
        if(struct == null)
            struct = new B();
        return struct;
    }

    private A head;

    private B(){
        head = null;
        System.out.println("H");
    }

    public void add(A obj){
        if(head == null){
            head = obj;
        }else{
            A tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = obj;
        }
        System.out.println("I"+obj);
    }

    public void show(A head){
        A tmp = head;
        if(tmp != null){
            System.out.println("J"+tmp);
            show(tmp.next);
        }
    }
}