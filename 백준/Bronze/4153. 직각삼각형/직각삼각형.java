import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        while (a != 0 && b != 0 && c != 0) {
            if (a > b) {
                int temp;
                temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp;
                temp = b;
                b = c;
                c = temp;
            }
            if (c * c == a * a + b * b)
                System.out.println("right");
            else
                System.out.println("wrong");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
    }
}