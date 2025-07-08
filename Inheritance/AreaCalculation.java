import java.util.Scanner;
class shape{
    void calculateArea(){

    }
    void dimensions(Scanner sc){
    }
}
class rectangle extends shape{
    double length;
    double width;
    @Override
    void dimensions(Scanner sc){
        System.out.println("enter rectangle length: "+length);
        length =sc.nextDouble();
        System.out.println("enter rectangle width: "+width);
        width =sc.nextDouble();
    }
    @Override
    void calculateArea(){
        double area =length*width;
        System.out.println("area of rectangle is: "+area);
    }
}
class triangle extends shape{
    double base;
    double height;
    @Override
    void dimensions(Scanner sc){
        System.out.println("enter triangle base: "+base);
        base =sc.nextDouble();
        System.out.println("enter triangle height: "+height);
        height =sc.nextDouble();
    }
    @Override
    void calculateArea(){
        double area =0.5*base*height;
        System.out.println("area of triangle is: "+area);
    }
}
class circle extends shape{
    double radius;
    @Override
    void dimensions(Scanner sc){
        System.out.println("enter circle radius: "+radius);
        radius =sc.nextDouble();    
    }
    @Override
    void calculateArea(){
        double area =3.14*radius*radius;
        System.out.println("area of circle is: "+area);
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle c =new circle();
        c.calculateArea();
        sc.close();
    }
    
}
