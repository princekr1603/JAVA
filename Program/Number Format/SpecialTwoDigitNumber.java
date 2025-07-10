// if the sum of product of digit in a number and sum of digit in a number if it is equal to the
// original number such numbers are called special two digits number.
// ex: 39,19 =sum(1+9)=10 + prod(1*9)=9=[10+9=19]
import java.util.Scanner;
public class SpecialTwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.: ");
        int n=sc.nextInt();
        int d1=n%10;
        int d2=n/10;

        int sum=d1+d2;
        int prod=d1*d2;
        if((sum+prod)==n){
            System.out.println("it is a special two digit number");
        }
        else{
            System.out.println("it is a not special two digit number");
        }
        sc.close();
    }
}
