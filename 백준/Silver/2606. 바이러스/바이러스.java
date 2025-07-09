// code from chatGPT

import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int computer = in.nextInt();
        int link = in.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= computer; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 입력
        for (int i = 0; i < link; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);  // 양방향 연결
        }

        visited = new boolean[computer + 1];
        dfs(1);  // 1번 컴퓨터부터 시작

        System.out.println(count - 1);  // 1번 제외한 감염 컴퓨터 수
    }

    static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}