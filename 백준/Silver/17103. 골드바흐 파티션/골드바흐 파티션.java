import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/17103
 * <p>
 * 골드바흐 파티션
 */
public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        // 5
        // 6
        // 8
        // 10
        // 12
        // 100
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수

        int MAX_INPUT = 1_000_000;
        boolean[] isPrime = new boolean[MAX_INPUT + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // 에라토스테네스의 체 알고리즘 사용 (소수 판별)
        for (int i = 2; i <= Math.sqrt(MAX_INPUT); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX_INPUT; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i < testCaseCount; i++) {
            int num = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= num / 2; j++) {
                if (isPrime[j] && isPrime[num - j]) {
                    count++;
                }
            }

            System.out.println(count);
        }
        br.close();
    }
}
