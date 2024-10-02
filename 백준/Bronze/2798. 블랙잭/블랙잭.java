import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
// https://www.acmicpc.net/problem/2798
public class Main {

    static int n, m;
    static boolean[] visited;
    static int[] cards;
    static int answer;

    static void DFS(int level, int sum) {
        if (sum > m) return;
        if (level == 3) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                DFS(level + 1, sum + cards[i]);
                visited[i] = false;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        visited = new boolean[n];

        DFS(0, 0);
        System.out.println(answer);
    }
}
