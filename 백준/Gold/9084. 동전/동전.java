import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/9084
 * <p>
 * 동전
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(br.readLine());


        for (int q = 0; q < testCaseCount; q++) {
            int coinCount = Integer.parseInt(br.readLine());
            int[] coins = new int[coinCount + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int p = 1; p <= coinCount; p++) {
                coins[p] = Integer.parseInt(st.nextToken());
            }
            int result = Integer.parseInt(br.readLine());

            int[] dp = new int[result + 1];
            dp[0] = 1;

            for (int i = 1; i <= coinCount; i++) {
                int coin = coins[i];
                for (int j = coin; j <= result; j++) {
                    dp[j] += dp[j - coin];
                }
            }

            System.out.println(dp[result]);
        }
    }
}