import java.util.*;

class Main {
    public static void main(String args[]) {
        int cnt = 0;
        int mods[] = new int[10];
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            int number = in.nextInt();
            mods[i] = number % 42;
        }
        for (int i = 0; i < 10; i++) {
            int flag = 1;
            for (int j = i + 1; j < 10; j++)
                if (mods[i] == mods[j]) flag = 0;
            if (flag == 1) cnt++;
        }
        System.out.println(cnt);
    }
}