import java.util.Scanner;

public class DiseriumNumber {
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
            count--;
        }
        if(sum==temp2){
            System.out.println(temp2+" it is diserium number");
        }
        else{
            System.out.println(temp2+" it is not diserium number");
        }
        sc.close();
    }
}
