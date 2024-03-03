import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        // AABCDD
        // afzz
        // 09121
        // a8EWg6
        // P5h3kx

        // 예제 입력
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\u0000') {
                    continue;
                }
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}
