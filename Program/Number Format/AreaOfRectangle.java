import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter length: ");
        int length=sc.nextInt();
        System.out.print("enter breadth: ");
        int breadth=sc.nextInt();
        System.out.println("area of rectangle is "+length*breadth);
        sc.close();
    }
}
