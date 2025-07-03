import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no: ");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int d1=n%10;
            sum=sum*10+d1;
            n=n/10;
        }
        System.out.println("Reverse is "+sum);
        // int d1=n%10;
        // int d2=n/10;
        // rev=d1*10+d2;
        // System.out.println(rev);
        sc.close();
    }
}
