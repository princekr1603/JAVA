import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.print("enter a:");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Hello world");
        if(a>10){
            System.out.println("pass");
        }
        else{
            System.out.println("error");
        }
    }
}
