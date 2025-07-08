import java.util.Scanner;
public class Xylem_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
       int mean=0;
       int extream=n%10;
       n=n/10;
       while(n>9){
        int digit=n%10;
        mean=mean+digit;
        n=n/10;
       }
       extream=extream+n;
       if(mean==extream){
        System.out.println("xylem number");
       }
       else{
        System.out.println("not xylem number");
       }
       
       sc.close();
    }
}
//Xylem number or pholoem number:-
//if the sum of means in a number and sum of extreames in a number
// if both of them are same then such numbers are called xylem number
//1245(here 1,5 are extreams and 2,4 are means in a number)
// first and last are extreme and between is mean
