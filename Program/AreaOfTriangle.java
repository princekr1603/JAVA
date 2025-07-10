import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter base: ");
        double base=sc.nextInt();
        System.out.print("enter height: ");
        double height=sc.nextInt();
        System.out.println("Area of triangle is "+0.5*(base*height));
        sc.close();
    }
}
