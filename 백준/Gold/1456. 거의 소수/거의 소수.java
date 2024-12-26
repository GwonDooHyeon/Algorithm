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
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        // 2. 거의 소수 확인
        int answer = 0;
        for (int i = 2; i < isPrime.length; i++) {

            if (isPrime[i]) {
                long power = (long) i * i;

                while (power <= end) {
                    if (power >= start) {
                        answer++;
                    }

                    // double로 형변환한 이유는 power * i가 long의 범위를 넘어갈 수 있기 때문
                    if ((double) power * i > end) break;
                    power *= i;
                }

            }

        }

        System.out.println(answer);
    }
}
