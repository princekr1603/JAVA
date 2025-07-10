import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter length: ");
        int length=sc.nextInt();
        System.out.print("enter breadth: ");
        int breadth=sc.nextInt();
        System.out.println("Perimeter of rectangle is "+2*(length+breadth));
        sc.close();
    }
}
