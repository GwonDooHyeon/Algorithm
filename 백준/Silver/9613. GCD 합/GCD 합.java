import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        // 3
        // 4 10 20 30 40
        // 3 7 5 12
        // 3 125 15 25
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수
        StringTokenizer st;

        for (int tc = 0; tc < testCaseCount; tc++) {
            long sum = 0;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 각 행의 테스트 케이스 갯수
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }

            System.out.println(sum);
        }
        br.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
