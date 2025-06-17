public class this1 {
    int x=100;
    public static void main(String[] args) {
        System.out.println("main method start");
        this1 p=new this1();
        System.out.println("main method x = "+p.x);
        System.out.println("main method end");

    }
    {
        System.out.println("G.V of x is "+x);
        x=50;      
        int x=340;
        System.out.println("L.V of x is "+x); 
        System.out.println(this.x);                           

    }
}
