import java.util.Scanner;
public class Intro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size=sc.nextInt();
        char[] arr=new char[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter value: ");
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
