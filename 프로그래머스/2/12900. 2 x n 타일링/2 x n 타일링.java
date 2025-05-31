class Solution {
    
    public int solution(int n) {
        
        int tiles[] = new int[n];
        tiles[0] = 1;
        tiles[1] = 2;
        
        for (int i = 2; i < n; i++) {
            
            tiles[i] = tiles[i - 2] % 1000000007 + tiles[i - 1] % 1000000007;
        }
        return tiles[n - 1] % 1000000007;
    }
}