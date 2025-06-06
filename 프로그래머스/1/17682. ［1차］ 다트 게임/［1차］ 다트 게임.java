import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    
    public int solution(String dartResult) {
        
        String regex = "([0-9]|10)([S|D|T])([*|#]*)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(dartResult);
        
        int total = 0;
        int[] score = {0, 0, 0};
        int idx = 0;
        
        while (m.find()) {
            
            score[idx] = Integer.parseInt(m.group(1));
            
            switch(m.group(2).charAt(0)) {
                case 'S':
                    break;
                case 'D':
                    score[idx] *= score[idx];
                    break;
                case 'T':
                    score[idx] *= score[idx] * score[idx];
                    break;
            }
            if ("".equals(m.group(3))) {
                idx++;
                continue;
            }
            switch (m.group(3).charAt(0)) {
                case '*':                        
                    if (idx > 0)
                        score[idx - 1] *= 2;
                    score[idx] *= 2;
                    break;
                case '#':
                    score[idx] *= -1;
                    break;
            }
            idx++;
        }
        return score[0] + score[1] + score[2];
    }
}