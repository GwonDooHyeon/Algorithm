import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알고리즘 수업 - 피보나치 수 1
// https://www.acmicpc.net/problem/24416
public class Main {

    static int fiboCount = 0;

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            fiboCount++;
            return 1;
        }

        return fibo(n - 2) + fibo(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 5
        int n = Integer.parseInt(br.readLine());

        fibo(n);
        // 재귀 호출 시 count
        // 동적 프로그래밍 호출 시 count
        // 출력 5 3
        System.out.println(fiboCount + " " + (n - 2));
    }
}
