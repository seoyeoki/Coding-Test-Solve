import java.util.ArrayList;

class Solution {
    
    boolean visitedAll(boolean[] visited) {
        
        int n = visited.length;
        
        for(int i = 0; i < n; i++) {
            if (visited[i] == false)
                return false;
        }
        return true;
    }
    
    int notVisited(boolean[] visited) {
        
        int n = visited.length;
        
        for(int i = 0; i < n; i++) {
            if (visited[i] == false)
                return (i + 1);
        }
        return 0; // 실질적 접근 X인 코드
    }
    
    int getGroupSize(int[] cards, boolean[] visited, int idx) {
        
        int cnt = 0;
        
        while (visited[idx - 1] == false) {
            
            visited[idx - 1] = true;
            cnt++;
            idx = cards[idx - 1];
        }
        return cnt;
    }
    
    int getMax(ArrayList<Integer> boxGroup) {
        
        int n = boxGroup.size();
        
        if (boxGroup.isEmpty() == true)
            return 0;
        
        int max = boxGroup.get(0);
        for (int i = 1; i < n; i++) {
            if (max < boxGroup.get(i)) {
                max = boxGroup.get(i);
            }
        }
        boxGroup.remove(Integer.valueOf(max));
        return max;
    }
    
    public int solution(int[] cards) {
        
        boolean[] visited = new boolean[cards.length];
        
        ArrayList<Integer> boxGroup = new ArrayList<Integer>();
        
        while (visitedAll(visited) == false) {
            int firstBox = notVisited(visited);
            boxGroup.add(getGroupSize(cards, visited, firstBox));
        }
        
        int box1 = getMax(boxGroup);
        int box2 = getMax(boxGroup);
        return box1 * box2;
    }
}