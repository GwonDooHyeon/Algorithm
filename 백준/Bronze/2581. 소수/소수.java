import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2581
// 소수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine()); // 60
        int n = Integer.parseInt(br.readLine()); // 100
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
