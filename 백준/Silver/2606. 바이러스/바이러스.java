import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Main {

    static class Group {
        
        ArrayList<Set<Integer>> groups = new ArrayList<Set<Integer>>();
        Set<Integer> answerGroup = new HashSet<Integer>();
    
        boolean inGroup(int com) {
        
            for (Set<Integer> group: groups) {
            
                if (group.contains(com) == true)
                    return true;
            }
            return false;
        }
        
        ArrayList<Integer> getGroup(int com) {
    
            ArrayList<Integer> idx = new ArrayList<Integer>();
            
            int groupnum = groups.size();
            
            for (int i = 0; i < groupnum; i++) {
                
                if (groups.get(i).contains(com) == true)
                    idx.add(i);
            }
            return idx;
        }

        void answerGroupDFS(int target, boolean[] visitedGroup) {

            ArrayList<Integer> idx = getGroup(target);

            for (int i = 0; i < idx.size(); i++) {

                int groupCursor = idx.get(i);
            
                if (visitedGroup[groupCursor] == false) {

                    visitedGroup[groupCursor] = true;
                
                    for (int com : groups.get(groupCursor)) {

                        answerGroup.add(com);
                        answerGroupDFS(com, visitedGroup);
                    }
                }
            }
        }
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);

        Group treatGroup = new Group();
        
        int computer = in.nextInt();
        int links = in.nextInt();
        
        treatGroup.groups.add(new HashSet<Integer>());
        
        for (int i = 0; i < links; i++) {
            
            int com1 = in.nextInt();
            int com2 = in.nextInt();
            
            if (treatGroup.inGroup(com1) == true) {
                
                ArrayList<Integer> idx = treatGroup.getGroup(com1);
                treatGroup.groups.get(idx.get(0)).add(com2);
            }
            else if (treatGroup.inGroup(com2) == true) {
                
                ArrayList<Integer> idx = treatGroup.getGroup(com2);
                treatGroup.groups.get(idx.get(0)).add(com1);
            }
            else {
                Set<Integer> newGroup = new HashSet<Integer>();
                
                newGroup.add(com1);
                newGroup.add(com2);
                
                treatGroup.groups.add(newGroup);
            }
        }

        boolean[] visitedGroup = new boolean[treatGroup.groups.size()];
        treatGroup.answerGroupDFS(1, visitedGroup);
        
        System.out.print(treatGroup.answerGroup.size() > 0? treatGroup.answerGroup.size() - 1 : 0);
    }
}