import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        int temp1=n;
        int temp2=n;
        int count=0;
        int sum=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        while(temp1!=0){
            int digit=temp1%10;
            int prod=1;
            for(int i=1;i<=count;i++){
                prod=prod*digit;
            }
            temp1=temp1/10;
            sum=sum+prod;
        }
        if(sum==temp2){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not armstrong number");
        }
        sc.close();
    }
}
