import java.util.Scanner;

public class ReverseEachElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter values: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array is: ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int rev=0;
            while(num!=0){
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            arr[i]=rev;
        }
        System.out.println();
        System.out.print("Reversed array is: ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    sc.close(); 
    }

}
