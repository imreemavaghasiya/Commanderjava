public class Arraystore {
    public static void main(String[] args) {
        Integer a[] = { 60, 70, 80, 90, 50 };
        Integer b[] = { 1, 2, 3, 4, 5 };
        Integer sum[] = new Integer[5];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = a[i] + b[i];
            System.out.println(sum[i]);
        }
    }
}