import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int casenum;
        int index = 0;
        String answer;
        
        Scanner in = new Scanner(System.in);
        casenum = in.nextInt();
        
        for (int i = 0; i < casenum; i++) {
            int r = in.nextInt();
            String c = in.next();
            int len = c.length();
            answer = "";
            
            for (int j = 0; j < len; j++) {
                String at = "" + c.charAt(j);
                answer += at.repeat(r);
            }
            System.out.println(answer);
        }
    }
}