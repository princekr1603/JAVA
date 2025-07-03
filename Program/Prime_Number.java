import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.: ");
        int n=sc.nextInt();
        boolean flag=false;
        if(n==1){
            System.out.println("not a prime number");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not a prime number");
                flag=true;
                break;
            }   
        }
        if(flag==false){
            System.out.println("prime number");   
        }
        sc.close();
    }
}
