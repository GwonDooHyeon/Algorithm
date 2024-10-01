import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
// https://www.acmicpc.net/problem/2309
public class Main {

    static final int TOTAL_HEIGHT = 100;
    static int[] dwarfs = new int[9]; // 난쟁이들의 키
    static boolean[] visited = new boolean[9];
    static int[] answer = new int[7];
    static boolean found = false;

    static void DFS(int level, int sum) {
        if (found) return;

        if (level == 7) {
            if (sum == TOTAL_HEIGHT) {
                found = true;
                Arrays.stream(answer).sorted().forEach(System.out::println);
            }
            return;
        }

        for (int i = 0; i < 9; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[level] = dwarfs[i];
                DFS(level + 1, sum + dwarfs[i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int height = 0; height < 9; height++) {
            dwarfs[height] = Integer.parseInt(br.readLine());
        }

        DFS(0, 0);
    }

}
