class Solution {
    
    void move(String input, int[] answer) {
        
        switch(input) {
                
            case "left":
                answer[0] -= 1;
                break;
            case "right":
                answer[0] += 1;
                break;
            case "up":
                answer[1] += 1;
                break;
            case "down":
                answer[1] -= 1;
                break;
        }
    }
    
    void validatePoint(int[] answer, int[] board) {
        
        int maxWidth = board[0] / 2;
        int maxHeight = board[1] / 2;
        
        if (answer[0] > maxWidth)
            answer[0] = maxWidth;
        if (answer[0] < -maxWidth)
            answer[0] = -maxWidth;
        if (answer[1] > maxHeight)
            answer[1] = maxHeight;
        if (answer[1] < -maxHeight)
            answer[1] = -maxHeight;
    }
    
    public int[] solution(String[] keyinput, int[] board) {
        
        int[] answer = {0, 0};
        
        for (String input: keyinput) {
            
            move(input, answer);
            
            validatePoint(answer, board);
        }
        
        return answer;
    }
}