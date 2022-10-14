public class bai202 {
    public static boolean isHappy(int n) {
        if (n < 7 && n > 1) {
            return false;
        }

        int sum = 0;

        if (n == 1) {
            return true;
        }

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }

        return isHappy(sum);
    }

    public static void main(String[] args) {
        int n = 19;

        System.out.println(isHappy(n));
    }
}
