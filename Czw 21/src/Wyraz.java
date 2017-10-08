public class Wyraz {
    private Wyraz next;
    private Wyraz head;
    private String name;

    public Wyraz(String name){
        this.name = name;
        if (head == null)
            head = this;
    }

    public void setNastepnyWyraz(String name){
        Wyraz tmp = head;
        while (tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = new Wyraz(name);
    }

    public void show(){
        Wyraz tmp = head;
        while (tmp.next!=null){
            System.out.print(tmp.name + " ");
            tmp = tmp.next;
        }
        System.out.print(tmp.name);
    }
}