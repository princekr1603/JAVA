import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        int sum=0;
        int sq=n*n;
        int temp=sq;
        while(sq!=0){
            int digit=sq%10;
            sum=sum+digit;
            sq=sq/10;
        }
        if(sum==temp){
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon number");
        }
        sc.close();
    }
}
