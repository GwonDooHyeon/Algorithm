import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다리 놓기
// https://www.acmicpc.net/problem/1010
public class Main {

    static int n, m;
    static int[][] dp;

    static int combination(int n, int m) {
        if (dp[n][m] != 0) return dp[n][m];
        if (n == m || m == 0) return 1;
        return dp[n][m] = combination(n - 1, m - 1) + combination(n - 1, m);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 3
        // 2 2
        // 1 5
        // 13 29
        int testCaseCount = Integer.parseInt(br.readLine());
        dp = new int[31][31];
        StringTokenizer st;
        for (int i = 0; i < testCaseCount; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // 서쪽
            m = Integer.parseInt(st.nextToken()); // 동쪽

            // 출력
            // 1
            // 5
            // 67863915
            System.out.println(combination(m, n));
        }

    }

}
