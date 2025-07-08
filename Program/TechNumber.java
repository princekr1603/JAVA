import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(n!=0){
            n=n/10;
            count++;
        }
        if(count%2==0){
            int d=1;
            for(int i=1;i<=count/2;i++){
                d=d*10;
            }
            System.out.println("d ="+d);
            int fhalf=temp/d;
            int shalf=temp%d;
            int sum=fhalf+shalf;
            int sq=sum*sum;
            if(sq==temp){
                System.out.println("Tech number");
            }
            else{
                System.out.println("Not Tech number");
            }
        }
        else{
            System.out.println("Give even digit number");
        }
        sc.close();
    }
}
