import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int input;
        int output;
        int[] origin = {1, 1, 2, 2, 2, 8};
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            input = sc.nextInt();
            origin[i] -= input;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(origin[i] + " ");
        }
        System.out.print(origin[5]);
    }
    
}