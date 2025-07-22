import java.util.Scanner;
public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int k = 0; k < arr.length; k++) {
            System.out.print("Enter value: ");
            arr[k] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length - 1;
        boolean flag = false;

        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("no");
        }
        else {
            System.out.println("yess");
        }
        sc.close();
    }
}
