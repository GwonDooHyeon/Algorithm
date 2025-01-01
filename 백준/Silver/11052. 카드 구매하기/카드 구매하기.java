import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11052
 * <p>
 * 카드 구매하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cardCount = Integer.parseInt(br.readLine()); // 카드 개수
        int[] cardPrice = new int[cardCount + 1]; // 카드 가격

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= cardCount; i++) {
            cardPrice[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[cardCount + 1]; // 카드 개수에 따른 최대 가격

        for (int i = 1; i <= cardCount; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], cardPrice[j] + dp[i - j]);
            }
        }
        System.out.println(dp[cardCount]);

        br.close();

    }
}
