import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n;j++){
                if(i<=j){
                    System.out.print(a++ +" ");
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
