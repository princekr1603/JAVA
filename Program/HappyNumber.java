import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        while(n!=1 && n!=4){
            int sum=0;
            while(n!=0){
                int digit=n%10;
                int sq=digit*digit;
                sum=sum+sq;
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println("it is happy number");
        }
        else{
            System.out.println("it is not happy number");
        }
        sc.close();
    }
}
