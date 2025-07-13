import java.util.Scanner;

public class LCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        // LCM using formula: LCM = (n1 * n2) / GCD
        int lcm = (n1 * n2) / gcd;

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);

        sc.close();
    }
}
