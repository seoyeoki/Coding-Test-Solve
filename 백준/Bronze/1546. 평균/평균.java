import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        double sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++)
        {
            int score = in.nextInt();
            max = Math.max(max, score);
            sum += score;
        }
        double avg = sum / n;
        System.out.print(avg / max * 100);
    }
}