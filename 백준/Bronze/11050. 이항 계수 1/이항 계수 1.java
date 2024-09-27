import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항 계수 1
// https://www.acmicpc.net/problem/11050
public class Main {

    static int n, k;
    static int[][] dp;

    public static int combination(int n, int k) {
        if (dp[n][k] > 0) return dp[n][k];
        if (k == 0 || n == k) return 1;
        return dp[n][k] = combination(n - 1, k - 1) + combination(n - 1, k);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 5 2
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 5
        k = Integer.parseInt(st.nextToken()); // 2
        dp = new int[n + 1][k + 1];

        // 출력 10
        System.out.println(combination(n, k));
    }

}
