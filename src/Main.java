//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c = 10;
        int d = 5;

        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println("sum1 is bigger than sum2: " + (sum1 > sum2));
        sum1 += 1;
        sum2 -= 2;

        System.out.println("sum1 is bigger than sum2 after changes: " + (sum1 > sum2));
        boolean isEitherSumEven = ((sum1 % 2 == 0) || (sum2 % 2 == 0));
        System.out.println("either one sum is divisible by 2: " + isEitherSumEven);
    }
}