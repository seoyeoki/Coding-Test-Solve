class Solution {
    
    int getMax(int[] arr) {
        
        int max = 0;
        
        for (int num : arr) {
            if (max < num)
                max = num;
        }
        return max;
    }
    
    public int solution(int[][] triangle) {
        
        int n = triangle.length;
        int[][] maxSum = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            
            int row = triangle[i].length;
            
            for (int j = 0; j < row; j++) {
                
                if (i == 0)
                    maxSum[i][j] = triangle[i][j];
                else if (j == 0)
                    maxSum[i][j] = triangle[i][j] + maxSum[i - 1][j];
                else
                    maxSum[i][j] = triangle[i][j] + Math.max(maxSum[i - 1][j - 1], maxSum[i - 1][j]);
            }
        }
        
        int answer = getMax(maxSum[maxSum.length - 1]);
        return answer;
    }
}