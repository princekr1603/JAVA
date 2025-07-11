import java.util.Scanner;

public class LCD {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n1: ");
        int n1=sc.nextInt();
        System.out.print("enter n2: ");
        int n2=sc.nextInt();
        int lcm=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                lcm=i*i;
            }
        }
        System.out.println("GCD of "+n1+" and "+n2+" is: "+lcm);
        sc.close();
    }
}
