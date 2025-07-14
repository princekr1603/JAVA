import java.util.Scanner;

public class Custom1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=n;j++){
                if(i<=j || j+i>=2*n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }    
            }
            System.out.println();
        }
        sc.close();
    }
}
