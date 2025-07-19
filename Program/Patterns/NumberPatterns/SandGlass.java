import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        int a;
        for(int i=1;i<=n*2-1;i++){
            a=1;
            for(int j=1;j<=n*2-1;j++){
                if(i<=j && j+i<=n*2 || i+j>=n*2 && i>=j){
                    if(j<n){
                        System.out.print(a++ +" ");
                    }
                    else{
                        System.out.print(a-- +" ");
                    } 
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
