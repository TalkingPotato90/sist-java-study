package day0104;

public class Work0104 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d X %d = %2d    ", j, i, i * j);
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}