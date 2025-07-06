import java.util.Scanner;

class Prime {
    boolean isPrime(int num) {
        double sqrt = Math.sqrt(num);
    
        for (int i = 2; i < sqrt + 1; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    int[] getPrimes(int n) {
        int cnt = 1;
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i) == true)
                cnt++;
        }
        if (cnt == 0) return null;

        int[] primes = new int[cnt];
        primes[0] = 2;
        cnt = 1;
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i) == true) {
                primes[cnt] = i;
                cnt++;
            }
        }
        
        return primes;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        Prime p = new Prime();
        int[] primes = p.getPrimes(1000);
        if (primes == null) return ;

        int cnt = 0;
        for (int i = 0; i < N; i++)
        {
            int cmpd = in.nextInt();
            for (int prime : primes) {
                if (cmpd == prime) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.print(cnt);
    }
}