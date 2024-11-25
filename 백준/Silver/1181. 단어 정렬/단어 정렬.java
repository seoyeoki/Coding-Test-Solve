import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n, flag;
        String word;
        ArrayList<Integer> freq = new ArrayList<Integer>();
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<ArrayList<String>> collects = new ArrayList<ArrayList<String>>();
      
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            flag = 0;
            word = in.next();
            words.add(word);
            int len = word.length();
            for (int k : freq) {
                if (k == len) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) freq.add(len);
        }
        Collections.sort(freq);

        for (int i = 0; i < freq.get(freq.size() - 1) + 1; i++) {
            ArrayList<String> temp = new ArrayList<String>();
            collects.add(temp);
        }
        for (int i = 0; i < n; i++) {
            word = words.get(i);
            collects.get(word.length()).add(word);
        }
        for (int k : freq) {
            Collections.sort(collects.get(k));
        }
        for (int k : freq) {
            System.out.println(collects.get(k).get(0));
            for (int l = 1; l < collects.get(k).size(); l++) {
                if (collects.get(k).get(l - 1).equals(collects.get(k).get(l)))
                  continue;
                System.out.println(collects.get(k).get(l));
            }
        }
    }
}