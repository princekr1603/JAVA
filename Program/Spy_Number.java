//package Program;
import java.util.Scanner;
public class Spy_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter no: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int prod=1;
        while(n!=0){
            int digit =n%10;
            sum=sum+digit;
            prod=prod*digit;
            n=n/10;
        }
        if(sum==prod){
            System.out.println(temp +" is spy number");
        }
        else{
            System.out.println(temp +" is not a spy number");
        }
        sc.close();
    }
}
