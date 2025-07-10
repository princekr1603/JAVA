import java.util.Scanner;

public class MpowerN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter m: ");
        int m=sc.nextInt();
        System.out.print("enter n: ");
        int n=sc.nextInt();
        int prod=1;
        for(int i=1;i<=n;i++){
            prod=prod*m;
        }
        System.out.println(m+" to the power "+n+" is: "+prod);
        sc.close();
    }
}
