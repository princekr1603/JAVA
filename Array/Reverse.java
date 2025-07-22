import java.util.Scanner;

public class Reverse{
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
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.print("Reversed array is: ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    sc.close(); 
    }

}
