import java.util.Scanner;

public class FactorialOfEachElement {
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
            int fact=1;
            for(int j=1;j<=num;j++){
                fact=fact*j;
            }
            arr[i]=fact;
        }
        System.out.println();
        System.out.print("factorial of array is: ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    sc.close(); 
    }
}
