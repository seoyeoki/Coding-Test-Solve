import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0, flag = 0;
        char c, d;
        
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            flag = 1;
            c = str.charAt(i);
            switch (c) {
                case '=':
                    d = str.charAt(i - 1);
                    if (d == 'c' || d == 's') {}
                    if (d == 'z')
                        if (i > 1 && str.charAt(i - 2) == 'd') flag = 2;
                    break;
                case '-':
                    d = str.charAt(i - 1);
                    if (d == 'c' || d == 'd') {}
                    break;
                case 'j':
                    if (i < 1) {
                        flag = 0;
                        break;
                    }
                    d = str.charAt(i - 1);
                    if (d == 'l' || d == 'n') {}
                    else flag = 0;
                    break;
                default:
                    flag = 0;
                    break;
            }
            cnt -= flag;
            cnt++;
        }
        System.out.println(cnt);
    }
}