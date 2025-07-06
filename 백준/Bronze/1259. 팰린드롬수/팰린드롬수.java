import java.util.Scanner;
    
class Main {
    
    static boolean isPallin(String str) {
        
        int checklen = str.length() / 2;
        
        for (int i = 0; i < checklen; i++)
        {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1)))
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        boolean firstFlag = true;
        
        while (true)
        {
            String input = in.next();
            if (input.equals("0") == true)
                break;
            
            if (firstFlag == true)
                firstFlag = false;
            else
                System.out.println();
            
            if (isPallin(input) == true)
                System.out.print("yes");
            else
                System.out.print("no");
        }
    }
}