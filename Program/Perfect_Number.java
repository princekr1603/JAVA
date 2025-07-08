import java.util.Scanner;
public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }                                 
        if(sum==n){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
        sc.close();
    }
}
// if the sum of divisior of a number excluding the itself if it is equal to the original number
//then such numbers are called perfect number.
//n=6=(1,2,3,6)={1+2+3=6}(i.e, equal to original number)
//n=28(1,2,4,7,14)={1+2+4+7+14=28}