import java.util.Scanner;
import java.lang.Integer;

class Main{
    
    static void printString(int num) {
        if (num % 3 == 0 && num % 5 == 0)
            System.out.print("FizzBuzz");
        else if (num % 3 == 0)
            System.out.print("Fizz");
        else if (num % 5 == 0)
            System.out.print("Buzz");
        else
            System.out.print(num);
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int num = 0;
        
        for (int i = 0; i < 3; i++) {
            
            String str = in.next();
            
            if (str.equals("Fizz") == false && str.equals("Buzz") == false && str.equals("FizzBuzz") == false)
                num = Integer.parseInt(str);
            if (num != 0)
                num++;
        }
        printString(num);
    }
}