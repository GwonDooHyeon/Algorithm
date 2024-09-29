import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int coinTypes;
    static int totalCoins;

    // 동전 개수의 최솟값을 구하는 함수
    static int getMinCoinCount(int[] coins) {
        int coinsCount = 0;

        for (int coinTypeIndex = coinTypes - 1; coinTypeIndex >= 0; coinTypeIndex--) {
            coinsCount += totalCoins / coins[coinTypeIndex];
            totalCoins %= coins[coinTypeIndex];
        }

        return coinsCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 10 4200
        coinTypes = Integer.parseInt(st.nextToken()); // 동전의 종류
        totalCoins = Integer.parseInt(st.nextToken()); // 동전의 가치

        // 1
        // 5
        // 10
        // 50
        // 100
        // 500
        // 1000
        // 5000
        // 10000
        // 50000
        int[] coins = new int[coinTypes];
        for (int i = 0; i < coinTypes; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int coinCount = getMinCoinCount(coins);
        System.out.println(coinCount);
    }
}
