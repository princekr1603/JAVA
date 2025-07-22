import java.util.Scanner;

public class LargestElement {
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
            if(arr[0]<arr[i]){
                arr[0]=arr[i];   
            }
        }
        System.out.println();
        System.out.println("maximum is: "+arr[0]);
        sc.close(); 
    }

}
