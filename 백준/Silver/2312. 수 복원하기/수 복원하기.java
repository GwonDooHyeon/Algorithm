import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2312
 */
public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        // 2
        // 6
        // 24
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수

        for (int i = 0; i < testCaseCount; i++) {
            int num = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= num; j++) {
                while (num % j == 0) {
                    num /= j;
                    count++;
                }

                if (count > 0) {
                    System.out.println(j + " " + count);
                    count = 0;
                }
            }
        }
        br.close();
    }
}
