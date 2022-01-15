public class E2 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        int b = 1;
        int c = 0;
        int limit = 4000000;

        while (b < limit) {
            if (b % 2 == 0)
                sum += b;

            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(sum);
    }
}
