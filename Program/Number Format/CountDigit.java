import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
            
        }
        System.out.println("no.of digit are:"+count);
        sc.close();
    }
}
