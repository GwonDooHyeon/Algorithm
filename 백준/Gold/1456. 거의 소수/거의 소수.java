import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1456
 * <p>
 * 거의 소수
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        boolean[] isPrime = new boolean[(int) Math.sqrt(end) + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // 1. 소수 판별
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i + i; j < isPrime.length; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        // 2. 소수를 제곱시켜 나가면서 end보다 이하인지 확인
        int answer = 0;
        for (int i = 2; i < isPrime.length; i++) {

            if (isPrime[i]) {
                long power = (long) i * i;

                while (power <= end) {
                    if (power >= start) {
                        answer++;
                    }

                    // 오버플로 방지: power * i가 long 범위를 넘는지 확인
                    if ((double) power * i > end) break;
                    power *= i;
                }

            }

        }

        System.out.println(answer);
    }
}
