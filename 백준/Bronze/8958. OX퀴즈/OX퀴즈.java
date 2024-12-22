import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/8958
 * <p>
 * OX퀴즈
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수

        // 로직 영역
        for (int i = 0; i < testCaseCount; i++) {
            String input = br.readLine();
            int score = 0;
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(score);
        }
        br.close();
    }
}
