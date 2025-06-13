public class operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isLess = a < b;

        boolean andLogic = (a > 0) && (b > 0);
        boolean orLogic = (a < 0) || (b > 0);

        int preInc = ++a;
        int postDec = b--;

        int c = 10;
        c += 5;

        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Mul: " + mul);
        System.out.println("Div: " + div);
        System.out.println("Mod: " + mod);

        System.out.println("isEqual: " + isEqual);
        System.out.println("isNotEqual: " + isNotEqual);
        System.out.println("isGreater: " + isGreater);
        System.out.println("isLess: " + isLess);

        System.out.println("AND: " + andLogic);
        System.out.println("OR: " + orLogic);

        System.out.println("Pre-Inc a: " + preInc);
        System.out.println("Post-Dec b: " + postDec);

        System.out.println("c after += 5: " + c);
    }
}


