import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수들의 합
// https://www.acmicpc.net/problem/9506
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        while (true) {
            sb = new StringBuilder();
            int sum = 0;
            int n = Integer.parseInt(br.readLine());
            if(n == -1){
                break;
            }

            int half = n / 2;

            for (int i = 1; i <= half; i++) {
                if (n % i == 0) { // 약수
                    sum += i; // 약수의 합

                    if (i == half) {
                        sb.append(i);
                    } else{
                        sb.append(i + " + ");
                    }
                }
            }

            // 완전수가 아닌 경우
            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
            } else{
                System.out.println(n + " = " + sb);
            }
        }
    }
}
