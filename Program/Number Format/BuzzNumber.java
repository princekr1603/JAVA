import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        int digit=n%10;
        if(n%7==0 || digit==7){
            System.out.println("Buzz number");
        }
        else{
            System.out.println("not Buzz number");
        }
        sc.close();
    }
}
