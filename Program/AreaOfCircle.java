import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter radius: ");
        double radius=sc.nextDouble();
        System.out.println("Area of circle is "+3.14*(radius*radius));
        sc.close();
    }
}
