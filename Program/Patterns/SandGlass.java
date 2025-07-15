import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if((i<=j && j+i<=n*2) || (i+j>=n*2 && i>=j)){
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
