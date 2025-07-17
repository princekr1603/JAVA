import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:- ");
        int n=sc.nextInt();
        for(int i=1;i<=n*2-1;i++){
            for(int j=1;j<=n*2-1;j++){
                if(i==j||i+j==n*2||i==n||j==n){
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
