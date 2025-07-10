import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int fact=1;
            int digit=n%10;
            for(int j=1;j<=digit;j++){
                fact=fact*j;
            }
            sum=sum+fact;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println(temp+" is a strong number");
        }
        else{
            System.out.println(temp+" is not strong number");
        }
        sc.close();
    }
}
