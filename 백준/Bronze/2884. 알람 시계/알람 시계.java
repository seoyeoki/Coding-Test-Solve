import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int min = in.nextInt();

        min -= 45;
        if (min < 0) {
            min += 60;
            hour -= 1;
        }
        if (hour < 0) {
            hour += 24;
        }
        System.out.print(hour + " " + min);
    }
}