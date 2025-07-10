import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        boolean flag=false;
        while(n!=0){
            int digit=n%10;
            if(digit==0){
                flag=true;
                break;
            }
            n=n/10;
        }
        if(flag==true){
            System.out.println("it is a duck Number");
        }
        else{
            System.out.println("it is not a duck Number");
        }
        sc.close();
    }
}
