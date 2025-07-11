import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter how many no. want: ");
        int n=sc.nextInt();
        int fib1=0;
        int fib2=1;
        int fib3=0;

        for(int i=0;i<n;i++){
            System.out.print(fib1+" ");
            fib3=fib2+fib1;
            fib1=fib2;
            fib2=fib3;
        }
        sc.close();
    }
}
