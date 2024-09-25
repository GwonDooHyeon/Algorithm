import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2750
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        // 5
        int count = Integer.parseInt(br.readLine());
        // 5
        // 2
        // 3
        // 4
        // 1
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 출력
        // 1
        // 2
        // 3
        // 4
        // 5
        Arrays.sort(arr);
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}
