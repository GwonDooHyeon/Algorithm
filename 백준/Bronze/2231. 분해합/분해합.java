import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합
// https://www.acmicpc.net/problem/2231
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        // 1번 방식 (시간 오래걸림)
//        boolean found = false;
//        for (int i = 0; i < number; i++) {
//            String numberStr = String.valueOf(i);
//            String[] numberStrArr = numberStr.split("");
//            int sum = Arrays.stream(numberStrArr).mapToInt(Integer::parseInt).sum();
//            if (i + sum == number) {
//                found = true;
//                System.out.println(i);
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println(0);
//        }

        // 2번 방식
        int answer = 0;

        for (int i = 1; i < number; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (i + sum == number) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }

}
