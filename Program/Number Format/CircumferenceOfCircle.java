import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter radius: ");
        double radius=sc.nextDouble();
        System.out.println("Circumference of circle is "+3.14*2*radius);
        sc.close();
    }
}
