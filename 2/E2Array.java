public class E2Array {
    public static void main(String[] args) {
        int[]   a = new int[32];
        int     sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (i == 0)         a[i] = 1;
            else if (i == 1)    a[i] = 2;
            else                a[i] = a[i - 1] + a[i - 2];

            if ((a[i] % 2 == 0) && (a[i] < 4000000))
                sum += a[i];

            System.out.println(a[i]);
        }

        System.out.println("Even sum : " + sum);
    }
}
