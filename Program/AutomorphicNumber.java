import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter n: ");
       int n=sc.nextInt();
        int sq=n*n;
        boolean flag=false;
        while(n!=0){
            if(n%10==sq%10){
                n=n/10;
                sq=sq/10;
                flag=true;
            }
            else{
                flag=false;
                n=n/10;
                break;
            }
        }
        if(flag==true){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("not Automorphic number");
        }
        sc.close();
    }
}
