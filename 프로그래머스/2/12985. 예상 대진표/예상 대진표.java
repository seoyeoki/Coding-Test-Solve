class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 0;
        
        int[] A = new int[21];
        int[] B = new int[21];
        
        A[0] = a;
        B[0] = b;
        
        while (A[round] != B[round]) {
            
            A[round + 1] = (A[round] + 1) / 2;
            B[round + 1] = (B[round] + 1) / 2;
            round++;
        }
        
        return round;
    }
}