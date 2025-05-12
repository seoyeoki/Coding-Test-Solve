import java.util.Arrays;

class Solution {
    
    int[] compress(int[][] arr, int x, int y, int n) {
        
        int[] comp = {0, 0};
        
        if (n == 1) {
            comp[arr[x][y]]++;
            return comp;
        }
        
        int[] cmp0 = {1, 0}; boolean flag0 = true;
        int[] cmp1 = {0, 1}; boolean flag1 = true;
        
        int[][] c = {{}, {}, {}, {}};
        c[0] = compress(arr, x, y, n / 2);
        c[1] = compress(arr, x + n / 2, y, n / 2);
        c[2] = compress(arr, x, y + n / 2, n / 2);
        c[3] = compress(arr, x + n / 2, y + n / 2, n / 2);
        
        for (int[] cmpd: c)
        {
            if (flag0 == false && flag1 == false)
                break;
            if (Arrays.equals(cmpd, cmp0))
                flag1 = false;
            else if (Arrays.equals(cmpd, cmp1))
                flag0 = false;
            else
                flag0 = flag1 = false;
        }
        if (flag0 == true)
            return cmp0;
        else if (flag1 == true)
            return cmp1;
        else {
            comp[0] = c[0][0] + c[1][0] + c[2][0] + c[3][0];
            comp[1] = c[0][1] + c[1][1] + c[2][1] + c[3][1];
            return comp;
        }
    }
    
    public int[] solution(int[][] arr) {
        
        int[] answer;
        int n = arr.length;
        
        answer = compress(arr, 0, 0, n);
        
        return answer;
    }
}