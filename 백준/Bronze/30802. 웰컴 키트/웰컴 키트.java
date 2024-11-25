import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] sizes = new int[6];
        
        int person = in.nextInt();
        for (int i = 0; i < 6; i++) {
            sizes[i] = in.nextInt();
        }
        int shirt = in.nextInt();
        int pen = in.nextInt();
        
        int shirtCnt = 0;
        for (int i = 0; i < 6; i++) {
            if (sizes[i] == 0) continue;
            int flag = 0;
            if (sizes[i] % shirt != 0) flag = 1;
            shirtCnt += sizes[i] / shirt + flag;
        }
        System.out.println(shirtCnt);
        System.out.println(person / pen + " " + person % pen);
    }
}