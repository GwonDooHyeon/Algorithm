import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 분해합
// https://www.acmicpc.net/problem/2231
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        boolean found = false;
        for (int i = 0; i < number; i++) {
            String numberStr = String.valueOf(i);
            String[] numberStrArr = numberStr.split("");
            int sum = Arrays.stream(numberStrArr).mapToInt(Integer::parseInt).sum();
            if (i + sum == number) {
                found = true;
                System.out.println(i);
                break;
            }
        }

        if (!found) {
            System.out.println(0);
        }

    }

}
