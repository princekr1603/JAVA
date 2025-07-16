import java.util.Scanner;

public class Solid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n*2-1;i++){
            for(int j=1;j<=n*2-1;j++){
                if((i==1||j==1||i==n*2-1||j==n*2-1)||i+j==n+1||j-i==n-1||i-j==n-1||i+j==3*n-1){
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
