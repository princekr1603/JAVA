import java.util.Scanner;
public class Sunny_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter no: ");
        int n=sc.nextInt();
        n=n+1;
        boolean flag=false;

        //for(int i=1;i<n/2;i++)
        for(int i=1;i*i<=n;i++)
        {
            System.out.print(i+" ");
            if(i*i==n){
                System.out.println("it is a sunny number");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("it is not a sunny number");
        }
       sc.close();  
    }
}
